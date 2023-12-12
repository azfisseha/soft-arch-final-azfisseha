package edu.wctc;

import edu.wctc.IO.ConsoleInputHandler;
import edu.wctc.IO.ConsoleOutputHandler;
import edu.wctc.IO.InputHandler;
import edu.wctc.IO.OutputHandler;
import edu.wctc.Rooms.Room;

public class MazeIO {

    //A simple message to the player that their attempt had no effect that is repeated throughout the game.
    public static final String NULL_ATTEMPT = " Perhaps you should try something else?";


    private static InputHandler input;
    private static OutputHandler output;


    public MazeIO(InputHandler in, OutputHandler out){
        input = in;
        output = out;
    }



    public int mainMenu()
    {
        int choice = 1;

        do {
            output.println("What would you like to do?");
            output.println("1. Repeat room description");
            output.println("2. Interact");
            output.println("3. Loot");
            output.println("4. Fight");
            output.println("5. Move to another room");
            output.println("0. Exit Game");

            try {
                choice = input.nextInt();
            }catch (NumberFormatException e)
            {

            }
        }while (choice < 0 || choice > 6);

        return choice;
    }

    public void printRoom(Room currentRoom) {
        output.println(currentRoom.toString());
    }
}
