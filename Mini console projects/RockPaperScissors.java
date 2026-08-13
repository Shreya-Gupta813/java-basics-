import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = { "rock", "paper", "scissor" };
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";
        int myscore = 0;
        int computerscore = 0;
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Rock Paper Scissor");

        while (playAgain.equalsIgnoreCase("yes")) {//&& (myscore < 3 || computerscore < 3)
            System.out.print("Enter your choice: ");
            playerChoice = s.nextLine().toLowerCase();
            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissor")) {
                System.out.println("Invalid choice");
                continue;
            }

            computerChoice = choices[rand.nextInt(3)];
            System.out.printf("Computer choice: %s\n", computerChoice);
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissor") ||
                    playerChoice.equals("paper") && computerChoice.equals("rock") ||
                    playerChoice.equals("scissor") && computerChoice.equals("paper")) {
                System.out.println("You Won!!!");
                myscore++;
            } else {
                System.out.println("You Lost!!!");
                computerscore++;
            }
            System.out.print("Do you want to play again(yes/no):");
            playAgain = s.nextLine();
        }
        s.close();
        System.out.printf("Your Score: %d\n", myscore);
        System.out.printf("Computer Score: %d\n", computerscore);
    }
}
