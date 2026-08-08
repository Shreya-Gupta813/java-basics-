import java.util.Scanner;

public class CI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double p;
        double r;
        double t;
        double n;
        System.out.println("Enter the principle amount: ");
        p = s.nextDouble();
        System.out.println("Enter the rate in percentage: ");
        r = s.nextDouble() / 100;
        System.out.println("Enter the times compound per year: ");
        n = s.nextDouble();
        System.out.println("Enter the year: ");
        t = s.nextDouble();
        double amount;
        amount = p * Math.pow(1 + r / n, n * t);
        System.out.println("Amount is: " + amount);
    }
}
