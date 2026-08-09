import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        String[] ques = { "1. Which keyword is used to create a class in Java?",
                "2. Which method is the entry point of a Java program?",
                "3. Which data type is used to store whole numbers?",
                "4. Which data type stores true or false?",
                "5. Which symbol is used to end a statement in Java?" };
        String[][] options = { { "1) define", "2) class", "3) struct", "4) create" },
                { "1) start()", "2) run()", "3) main()", "4) execute()" },
                { "1) float", "2) char", "3) int", "4) boolean" },
                { "1) int", "2) boolean", "3) char", "4) String" },
                { "1) :", "2) .", "3) ;", "4) /" } };
        int[] answers = { 2, 3, 3, 2, 3 };
        int score = 0;
        int guess;
        Scanner s = new Scanner(System.in);
        System.out.println("************************");
        System.out.println("**Welcome to Quiz Game**");
        System.out.println("************************");
        for (int i = 0; i < ques.length; i++) {
            System.out.println(ques[i]);
            for (String option : options[i]) {
                System.out.println(option);

            }
            System.out.print("Enter your guess: ");
            guess = s.nextInt();
            if (guess == answers[i]) {
                score += 1;
                System.out.println("***********");
                System.out.println("**Correct**");
                System.out.println("***********");

            } else {
                System.out.println("***********");
                System.out.println("***Wrong***");
                System.out.println("***********");
            }
        }
        System.out.printf("Your final score is: %d out of 5", score);
        s.close();
    }
}
