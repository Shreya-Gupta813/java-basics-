import java.util.Random;

public class randomNumber {
    public static void main(String args[]) {
        Random rand = new Random();
        // int num1 = rand.nextInt(1, 101);
        // int num2 = rand.nextInt(1, 101);
        // int num3 = rand.nextInt(1, 101);
        // System.out.println("Random number: " + num1);
        // System.out.println("Random number: " + num2);
        // System.out.println("Random number: " + num3);
        // if(num1>num2){
        // if(num1>num3){
        // System.out.println("Largest number: "+num1);
        // }
        // else{
        // System.out.println("Largest number: "+num3);
        // }
        // }
        // else{
        // if(num2>num3){
        // System.out.println("Largest number: "+num2);
        // }
        // else{
        // System.out.println("Largest number: "+num3);
        // }
        // }
        // int largest = Math.max(num1, Math.max(num2, num3));
        boolean isHead;
        isHead = rand.nextBoolean();
        System.out.println(isHead);
        if (isHead) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}
