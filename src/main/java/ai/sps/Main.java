package ai.sps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Count.start();

        while (true) {
            // Prompt user
            System.out.print("Enter Rock, Paper, or Scissors (or 'quit' to stop): ");
            String userInput = scanner.nextLine().trim().toUpperCase();

            // Handle exit condition
            if (userInput.equals("QUIT")) {
                System.out.println("Thanks for playing!");
                break;
            }

            // Convert user input to Type
            Type userMove;
            try {
                userMove = Type.valueOf(userInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter Rock, Paper, or Scissors.");
                continue;
            }

            // Get AI's move
            Type aiMove = AI.getMove();

            // Print choices
            System.out.println("AI chose: " + aiMove);

            // Determine winner
            String result = determineWinner(userMove, aiMove);
            System.out.println(result);

            // Update AI knowledge
            Move move = new Move();
            move.t = userMove;
            Count.update(move);
        }

        scanner.close();
    }

    private static String determineWinner(Type userMove, Type aiMove) {
        if (userMove == aiMove) {
            return "It's a tie!";
        } else if ((userMove == Type.ROCK && aiMove == Type.SCISSORS) ||
                (userMove == Type.PAPER && aiMove == Type.ROCK) ||
                (userMove == Type.SCISSORS && aiMove == Type.PAPER)) {
            return "You win!";
        } else {
            return "AI wins!";
        }
    }
}