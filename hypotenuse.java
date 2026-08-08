import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] agrs) {
        Scanner s = new Scanner(System.in);
        double s1;
        double s2;
        double s3;
        System.out.println("Enter the perpendicular height of right angle triangle: ");
        s1 = s.nextDouble();
        System.out.println("Enter the base height of right angle triangle: ");
        s2 = s.nextDouble();
        s3 = Math.sqrt(Math.pow(s1, 2) + Math.pow(s2, 2));
        System.out.println("Hypotenuse side= " + s3);
        s.close();
    }
}
