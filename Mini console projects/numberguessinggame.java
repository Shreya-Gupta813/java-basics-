import java.util.Random;
import java.util.Scanner;

public class numberguessinggame {
    public static void main(String[] agrs) {
        Random rand = new Random();
        Scanner s = new Scanner(System.in);
        int num = rand.nextInt(1, 101);
        System.out.println("--NUMBER GUESSING GAME--");
        int guess;
        int attempt = 0;
        do {
            System.out.print("Guess the number: ");
            guess = s.nextInt();
            attempt++;
            if (guess < num) {
                System.out.println("Too Low!!");
                System.out.println(5 - attempt + " attempts left");
            } else if (guess > num) {
                System.out.println("Too High!!");
                System.out.println(5 - attempt + " attempts left");
            } else {
                System.out.println("Correct Guess\nWon!!!!");
                System.out.println("number was " + num);
            }

        } while (guess != num && attempt < 5 && attempt > 0);
        if (guess != num) {
            System.out.println("Better Luck Next Time!!!!");
            System.out.println("number was " + num);
        }
    }
}