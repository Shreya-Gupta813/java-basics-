package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Entre a number: ");
            int num = s.nextInt();
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero;");
        } catch (InputMismatchException e) {
            System.out.println("Not a number");
        } catch (Exception e) {
            System.out.println("Something went wrong!!");
        }
    }
}
