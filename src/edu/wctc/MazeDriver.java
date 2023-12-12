package edu.wctc;


import edu.wctc.IO.ConsoleInputHandler;
import edu.wctc.IO.ConsoleOutputHandler;
import edu.wctc.Rooms.Room;

public class MazeDriver {


    public static void main(String[] args) {
        MazeDriver game = new MazeDriver();
        game.startGame();
    }

    private static final String MENU = "";


    private Player player;
    private Room currentRoom;
    private MazeBuilder mazeBuilder = new MazeBuilder();

    private MazeIO IOHandler;

    public MazeDriver() {
        player = new Player();
        currentRoom = mazeBuilder.constructMaze();
        IOHandler = new MazeIO(new ConsoleInputHandler(), new ConsoleOutputHandler());
    }

    public void startGame()
    {
        int menuChoice = IOHandler.mainMenu();

        while(menuChoice > 0)
        {
            switch (menuChoice) {
                case 1: //Print Room Description
                    IOHandler.printRoom(currentRoom);
                case 2: //Interact
                    currentRoom.interact(player);
                case 3: //Loot
                case 4: //Fight
                case 5: //Move
                case 0: //Exit Game
            }
            menuChoice = IOHandler.mainMenu();
        }
    }


}
