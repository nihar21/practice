import java.util.Scanner;

/**
 * Created by kitty on 1/20/17.
 */
public class three {

    public static String removeDashes(String input) {
        String cat;
        do {
            cat = input.replace("-", "");
        } while (cat.indexOf('-') != -1);
        return cat;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter SSN");

        String input = keyboard.nextLine();
        System.out.println(removeDashes(input));
        
    }
}
