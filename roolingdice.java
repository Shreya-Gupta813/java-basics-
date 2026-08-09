import java.util.Scanner;
import java.util.Random;

public class roolingdice {
    public static void main(String[] args) {
        int noofdice;
        int total = 0;
        int roll;
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter the number of times you want to roll a dice: ");
        noofdice = s.nextInt();
        if (noofdice > 0) {
            for (int i = 0; i < noofdice; i++) {
                roll = rand.nextInt(1, 7);
                System.out.println("You rolled a " + roll);
                printdie(roll);
                total += roll;
            }
            System.out.println("Total= " + total);
        } else {
            System.out.println("Enter a positive number");
        }
        s.close();
    }

    static void printdie(int roll) {
        switch (roll) {
            case 1:
                System.out.println("---------\n|       |\n|   o   |\n|       |\n---------");
                break;
            case 2:
                System.out.println("---------\n| o     |\n|       |\n|     o |\n---------");
                break;
            case 3:
                System.out.println("---------\n| o     |\n|   o   |\n|     o |\n---------");
                break;
            case 4:
                System.out.println("---------\n| o   o |\n|       |\n| o   o |\n---------");
                break;
            case 5:
                System.out.println("---------\n| o   o |\n|   o   |\n| o   o |\n---------");
                break;
            case 6:
                System.out.println("---------\n| o   o |\n| o   o |\n| o   o |\n---------");
                break;
            default:
                System.out.println("Invalid roll");
        }
    }
}
