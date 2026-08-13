import java.util.Scanner;
import java.util.Random;

public class SlotMachine {
    static Scanner s = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String play;
        System.out.println("**********************************");
        System.out.println("* Welcome to Java Slot Spin Game *");
        System.out.println("**********************************\n");
        System.out.println("*************************");
        System.out.println("* Symbols: 🍕🍔🍟🌭🍿 *");
        System.out.println("*************************");
        while (balance > 0) {
            System.out.print("\nEnter the amount to bet: ");
            bet = s.nextInt();
            s.nextLine();
            if (bet > balance) {
                System.out.println("Insufficient Funds");
                continue;
            } else if (bet <= 0) {
                System.out.println("Invalid amount entered");
                continue;
            } else {
                balance -= bet;
            }
            row = spin();
            printrow(row);
            payout = getpayout(row, bet);
            if (payout > 0) {
                System.out.println("you Won");
                balance += payout;

            } else {
                System.out.println("you lost");
            }
            System.out.println("Current balance: $" + balance);
            System.out.print("Do You want to play again(Y/N): ");
            play = s.nextLine().toUpperCase();
            if (!play.equals("Y")) {
                break;
            }
        }
        System.out.println("Thankyou");
        s.close();
    }

    static String[] spin() {
        String[] symbols = { "🍕", "🍔", "🍟", "🌭", "🍿" };
        String[] row = new String[3];
        for (int i = 0; i < 3; i++) {
            row[i] = symbols[rand.nextInt(symbols.length)];
        }
        return row;
    }

    static void printrow(String[] row) {
        for (String s : row) {
            System.out.print(s + " ");
        }
    }

    static int getpayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍕" -> bet * 3;
                case "🍔" -> bet * 5;
                case "🍟" -> bet * 7;
                case "🌭" -> bet * 9;
                case "🍿" -> bet * 11;
                default -> 0;
            };
        } else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍕" -> bet * 2;
                case "🍔" -> bet * 4;
                case "🍟" -> bet * 6;
                case "🌭" -> bet * 8;
                case "🍿" -> bet * 10;
                default -> 0;
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍕" -> bet * 2;
                case "🍔" -> bet * 4;
                case "🍟" -> bet * 6;
                case "🌭" -> bet * 8;
                case "🍿" -> bet * 10;
                default -> 0;
            };
        } else if (row[0].equals(row[2])) {
            return switch (row[2]) {
                case "🍕" -> bet * 2;
                case "🍔" -> bet * 4;
                case "🍟" -> bet * 6;
                case "🌭" -> bet * 8;
                case "🍿" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}
