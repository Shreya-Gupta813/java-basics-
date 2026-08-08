import java.util.Scanner;
public class weightConversion {
    public static void main(String[] args){
        double weight;
        double newWeight;
        int choice;
        Scanner s= new Scanner(System.in);
        System.out.println("---This is a weight conversion program---");
        System.out.println("Enter 1 for lbs to kgs: ");
        System.out.println("Enter 2 for kgs to lbs:");
        System.out.print("Enter your choice: ");
        choice=s.nextInt();
        if(choice==1){
            System.out.print("Enter your weight in lbs: ");
            weight=s.nextDouble();
            newWeight=weight*0.453592;
            System.out.printf("Weight in kgs is %.2f",newWeight);
        }
        else{
            System.out.print("Enter your weight in kgs: ");
            weight=s.nextDouble();
            newWeight=weight*2.20462;
            System.out.printf("Weight in lbs is %.2f",newWeight);  
        }
    }
    
}
