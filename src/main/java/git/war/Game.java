
package git.war;

public class Game {
    
    // Prompts user for next action after each round
    private void display() {
        System.out.print("Type 'show' to see card counts, 'continue' to play next round, or 'quit' to exit: ");
        String choice = scanner.nextLine().toLowerCase(); //makes it so user input can only  match the prompt

        switch (choice) {
            case "show":
                System.out.println(player1.getName() + " has " + player1.getDeckSize() + " cards."); //.getDeckSize() will be implemented and the function will go to the player and retrive the amount of cards currently in the players hand
                System.out.println(player2.getName() + " has " + player2.getDeckSize() + " cards.");
                break;
            case "continue":
                // Do nothing — next round will start
                break;
            case "quit":
                System.out.println("Game ended by user.");
                System.exit(0); // Exits the program
                break;
            default:
                System.out.println("Invalid choice. Continuing...");
        }
    }
    // Declares the winner when the game ends
    private void declareWinner() {
        if (player1.hasCards()) { //the hasCards will be implemented to check to see if there is any card in the players hand
            System.out.println(player1.getName() + " wins the game!"); //gets the name of player and displays that they won
        } else {
            System.out.println(player2.getName() + " wins the game!");
    
    }
    
}