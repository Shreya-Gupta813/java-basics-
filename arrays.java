import java.util.Scanner;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int size;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of fruits : ");
        size = s.nextInt();
        s.nextLine();
        String[] fruits;
        fruits = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter fruit " + (i + 1) + " : ");
            fruits[i] = s.nextLine();
        }
        Arrays.sort(fruits, String.CASE_INSENSITIVE_ORDER);
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        s.close();
    }
}
