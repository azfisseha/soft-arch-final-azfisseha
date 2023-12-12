package edu.wctc;


import edu.wctc.IO.ConsoleInputHandler;
import edu.wctc.IO.ConsoleOutputHandler;
import edu.wctc.IO.InputHandler;
import edu.wctc.IO.OutputHandler;
import edu.wctc.Rooms.Room;

public class MazeDriver {

    private static InputHandler input = new ConsoleInputHandler();
    private static OutputHandler output = new ConsoleOutputHandler();

    public static void main(String[] args) {
        MazeDriver game = new MazeDriver();
        game.startGame();
    }

    //A simple message to the player that their attempt had no effect that is repeated throughout the game.
    public static final String NULL_ATTEMPT = " Perhaps you should try something else?";

    private static final String MENU = "";


    private Player player;
    private Room currentRoom;
    private MazeBuilder mazeBuilder = new MazeBuilder();


    public MazeDriver() {
        player = new Player();
        currentRoom = mazeBuilder.constructMaze();
    }

    public void startGame()
    {
        int menuChoice = mainMenu();

        while(menuChoice > 0)
        {
            switch (menuChoice) {

            }
            menuChoice = mainMenu();
        }
    }

    private int mainMenu()
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

            choice = input.nextInt();
        }while (choice < 0 || choice > 6);

        return choice;
    }
}
