package edu.wctc;

import edu.wctc.Rooms.Builders.RoomBuilder;
import edu.wctc.Rooms.Room;

import java.util.Random;

public class MazeBuilder {
    private RoomBuilder roomBuilder;

    private Random rand = new Random();
    ///returns the starting room
    public Room constructMaze()
    {
        Room thisRoom = roomBuilder.buildRoom("basic", "Foyer", "You stand in the foyer of an abandoned mansion.  The walls are lined with decaying portraits of likely long dead patriarchs, and the room is dimly lit by the flicker of candlelight from an ornate chandelier overhead.  There is a large set of double doors in front of you.");

        thisRoom.setAdjoiningRoom(Directions.NORTH, roomBuilder.buildRoom("basic", "Main Hallway", "There are several doors leading out in every direction.  Which way will you proceed?"));
        thisRoom
                .getAdjoiningRoom(Directions.NORTH)
                .setAdjoiningRoom(Directions.SOUTH, thisRoom);

        //advance to the Main Hallway
        thisRoom = thisRoom.getAdjoiningRoom(Directions.NORTH);

        //randomly generate rooms in each of the following directions
        buildMazeBranch(thisRoom, Directions.NORTH);
        buildMazeBranch(thisRoom, Directions.EAST);
        buildMazeBranch(thisRoom, Directions.WEST);
    }

    private void buildMazeBranch(Room thisRoom, Directions dir)
    {
        //For the sake of reducing the complexity when actually playing the game, RNG generation will be limited to the following constraints
        //  1. No branching paths - i.e. The path that leads West from the "Main Hall" will only have rooms going West, and never branch in other directions
        //  2. The hallways don't "know" about each other - if there were to be a top-down view of this room layout, the viewer would see 3 snaking paths that all converge
        //      at their starting point, and have no relation to one another otherwise.  The player will not be able to end up in a different hallway without going back to
        //      the start.
        //  3. The odds of a hallway reaching its endpoint have been reduced from playtesting in order to allow the grader of this assignment to complete the game in a
        //      reasonable timeframe.

        double randomRoomTypeDouble = rand.nextDouble();
        Room nextRoom = null;

        //15% chance that the next room is a basic hallway with nothing to interact with.
        if(randomRoomTypeDouble < 0.15)
        {
            nextRoom = roomBuilder.buildRoom("basic");
        }
        //15% chance that the next room has loot for the player to obtain.
        else if(randomRoomTypeDouble < 0.3)
        {
            nextRoom = roomBuilder.buildRoom("lootable");
        }
        //15% chance that the next room has something for the player to interact with besides loot.
        else if(randomRoomTypeDouble < 0.45)
        {
            nextRoom = roomBuilder.buildRoom("interactable");
        }
        //15% chance that the next room has an enemy(?) encounter for the player to deal with.
        else if(randomRoomTypeDouble < 0.6)
        {
            nextRoom = roomBuilder.buildRoom("encounter");
        }

        //Set the adjoining room references so that the hallway is navigable.
        thisRoom.setAdjoiningRoom(dir, nextRoom);
        nextRoom.setAdjoiningRoom(dir.getOpposite(), thisRoom);

        //Recursive call to this same method in order to continue the hallway.
        buildMazeBranch(nextRoom, dir);
    }
}
