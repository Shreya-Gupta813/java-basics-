import java.util.Scanner;

public class Temperature {
    public static void main(String args[]) {
        double temp;
        double newtemp;
        String choice;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        temp = s.nextDouble();
        s.nextLine();
        System.out.print("Convert to Celsius or Fahrenheit (c/f):");
        choice = s.next();
        if (choice.equalsIgnoreCase("c")) {
            newtemp = (temp - 32) / 1.8;
            System.out.printf("Temperature in Celsius: %.2f\u00B0C", newtemp);
        } else if (choice.equalsIgnoreCase("f")) {
            newtemp = (temp * 1.8) + 32;
            System.out.printf("Temperature in Fahrenheit: %.2f\u00B0F", newtemp);

        }
        /*
         * TERNARY OPERATOR APPROACH
         * newtemp = (choice.equalsIgnoreCase("c")) ? ((temp - 32) / 1.8) : ((temp *
         * 1.8) + 32);
         * System.out.printf("%.2f", newtemp);
         */
        s.close();
    }
}
