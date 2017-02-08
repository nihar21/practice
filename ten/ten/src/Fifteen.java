import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by kitty on 1/25/17.
 */
public class Fifteen {

    public static Boolean onlyDigits(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter a string to determine if it is only digits");
        Scanner keyboard = new Scanner(System.in);
        String sample  = keyboard.next();
        System.out.println(onlyDigits(sample));
    }
}