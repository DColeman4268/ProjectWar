package git.war;

import java.util.Scanner;

public class War {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for Player 1's name and store it
        System.out.print("Enter Player 1 name: ");
        String name1 = scanner.nextLine();

        // Ask for Player 2's name and store it
        System.out.print("Enter Player 2 name: ");
        String name2 = scanner.nextLine();

        // Will be implemented to create a new Game instance with both player names
        Game game = new Game(name1, name2);

        // Will have a function to start the game
        game.startGame();
    }
}
