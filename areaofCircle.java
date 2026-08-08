import java.util.Scanner;

public class areaofCircle {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        double radius;
        System.out.print("Enter radius of circle: ");
        radius = s.nextDouble();
        System.out.printf("Circumference: %.1f\n", (2 * Math.PI * radius));
        System.out.printf("Area of Circle is: %.1f\n", Math.PI * Math.pow(radius, 2));
        System.out.printf(
                "Volume of Sphere of radius " + radius + " is: %.1f\n", (4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
    }
}
