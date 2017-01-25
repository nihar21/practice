import java.util.Scanner;

/**
 * Created by kitty on 1/24/17.
 */
public class six {

    public static String scroll (String s) {
        return s.substring(1) + s.charAt(0);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter string scroll");
        Scanner keyboard = new Scanner(System.in);
        String line = keyboard.nextLine();
        System.out.println(scroll(line));
    }

}
