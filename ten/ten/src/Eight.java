import java.util.Scanner;

/**
 * Created by kitty on 1/24/17.
 */
public class Eight {

    public static String invert (String s) {
        s = s.replace('0', 'z');
        s = s.replace('1', '0');
        s = s.replace('z', '1');
        return s;

    }

    public static void main(String[] args) {
        System.out.println("Enter 0s and 1s");
        Scanner keyboard = new Scanner(System.in);
        String binary = keyboard.nextLine();
        System.out.println(invert(binary));
    }



}
