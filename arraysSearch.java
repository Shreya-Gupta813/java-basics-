
// Linear Search
// Best: O(1)
// Average: O(n)
// Worst: O(n)
import java.util.Scanner;

public class arraysSearch {
    public static void main(String args[]) {
        String[] fruits = { "apple", "banana", "kiwi", "orange" };
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the element you want to search: ");
        String target = s.nextLine();
        boolean isFound = false;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equalsIgnoreCase(target)) {
                System.out.printf("%s found at index: %d%n", target, i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.printf("%s not found\n", target);
        }
        System.out.print("Array elements are: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        s.close();
    }
}
