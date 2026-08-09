import java.util.Scanner;

public class squareofnumber {
    public static void main(String[] agrs) {

        Scanner s = new Scanner(System.in);
        double num;
        System.out.print("Enter the number to calculate square: ");
        num = s.nextDouble();
        double res = square(num);
        System.out.printf("Square of %.1f is : %.2f", num, res);
    }

    static double square(double num) {
        double a = Math.pow(num, 2);
        return a;
    }
}
