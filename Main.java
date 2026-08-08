import java.util.Scanner;
// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String email;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your email: ");
        email = s.nextLine();
        if (email.contains("@gmail.com")) {
            int a = email.indexOf("@");
            String username = email.substring(0, a);
            String domain = email.substring(a + 1);
            System.out.println(username);
            System.out.println(domain);
        } else {
            System.out.println("Email is invalid");
        }
        s.close();
    }
}
