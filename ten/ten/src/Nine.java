import java.util.Scanner;

/**
 * Created by kitty on 1/25/17.
 */
public class Nine {

    public static Boolean homogenous (String s) {
        return s.matches(s.charAt(0) + "*");
    }

    public static void main(String[] args) {
        System.out.println("Enter a string of characters");
        Scanner keyboard = new Scanner(System.in);
        String in = keyboard.nextLine();
        System.out.println(homogenous(in));
    }

}
