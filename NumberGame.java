// Task : Number Guessing Game


import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int min = 1, max = 100;
        int number = rand.nextInt(max - min + 1) + min;
        int attempts = 0, maxAttempts = 5;

        System.out.println("Guess the number between " + min + " and " + max);

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess == number) {
                System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
                break;
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry! You've reached the maximum attempts. The number was: " + number);
            }
        }
    }
}


