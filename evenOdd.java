import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        // int score = 4;
        // String passorfail = (score >= 35) ? "PASS" : "FAIL";
        // System.out.println(passorfail);
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check even or odd: ");
        int num = s.nextInt();
        String check = (num % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(check);
        s.close();
    }
}
