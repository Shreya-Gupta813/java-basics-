import java.util.Scanner;

public class simplecalculator {
    public static void main(String[] agrs) {
        Scanner s = new Scanner(System.in);
        double num1;
        double num2;
        String op;
        double res = 0;
        boolean validoperator = true;
        System.out.print("Enter number 1: ");
        num1 = s.nextDouble();
        System.out.print("Enter the Operator(+,-,*,/,%,^): ");
        op = s.next();
        System.out.print("Enter number 2: ");
        num2 = s.nextDouble();
        switch (op) {
            case "+" -> res = num1 + num2;
            case "-" -> res = num1 - num2;
            case "*" -> res = num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("cannot divide by 0(zero)");
                    validoperator = false;
                } else {
                    res = num1 / num2;
                }
            }
            case "%" -> {
                if (num2 == 0) {
                    System.out.println("cannot divide by 0(zero)");
                    validoperator = false;
                } else {
                    res = num1 % num2;
                }
            }
            case "^" -> res = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator😒");
                validoperator = false;
            }
        }
        if (validoperator) {
            System.out.println(res);
        }
    }
}
