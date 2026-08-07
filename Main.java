import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double l = 0;
        double b = 0;
        double area = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        l = s.nextDouble();
        System.out.print("Enter the breadth of rectangle: ");
        b = s.nextDouble();
        area = l * b;
        System.out.println("Area of rectangle is: " + area + " cm\u00B2");
        s.close();
    }
}
