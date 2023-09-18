package oops;
import java.util.Scanner;

class Game {
    private int number;
    private int inputNumber;
    private int noOfGuesses = 0;

    // Setter method for noOfGuesses
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    // Getter method for noOfGuesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Constructor to generate a random number
    public Game() {
        this.noOfGuesses = 0; // Initialize the number of guesses
        this.number = (int) (Math.random() * 100); // Generate a random number between 0 and 99
    }

    // Method to take user input
    public void takeUserInput() {
        System.out.println("Guess the number");
        Scanner s = new Scanner(System.in);
        inputNumber = s.nextInt();
    }

    // Method to check if the user input is correct
    public boolean isCorrectNumber() {
        noOfGuesses++;

        if (inputNumber == number) {
            System.out.printf("Yes, you guessed it right. It was %d.\nYou guessed it in %d attempts.\n", number, noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too low...");
        } else {
            System.out.println("Too high...");
        }
        return false;
    }
}

public class GuessNumber {

    public static void main(String[] args) {
        /*
         * Create a class Game, which allows a user to play "Guess the number" game once.
         * Game should have the following methods:
         * 1. Constructor to generate the random number
         * 2. takeUserInput() to take a user input of a number
         * 3. isCorrectNumber() to detect whether the number entered by the user is correct
         * 4. Getter and setter for noOfGuesses
         * Use properties such as noOfGuesses (int). Get this task done!
         */

        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
