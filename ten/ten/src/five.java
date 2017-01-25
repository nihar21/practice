import java.util.Scanner;

/**
 * Created by kitty on 1/24/17.
 */
public class five {
    
    public static void main(String[] args) {
        System.out.println("Enter last four");
        Scanner keyboard = new Scanner(System.in);
        String ccNumber = keyboard.nextLine();
        int len = ccNumber.length();
        String last4 = ccNumber.substring(len - 4, len);
        String last5 = ccNumber.substring(len - 6, len);
        
        System.out.println(last4);
        System.out.println(last5);
    }

}
