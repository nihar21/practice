import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by kitty on 1/24/17.
 */
public class seven {

    public static void main(String[] args) {
        System.out.println("Enter Last, First");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();

        String[] firstLast = name.split(", ");
        System.out.println(firstLast[1] + ' ' + firstLast[0]);
    }

}
