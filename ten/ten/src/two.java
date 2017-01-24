import java.util.Scanner;

/**
 * Created by kitty on 1/20/17.
 */
public class two {

    public static Boolean endStar(String input) {
        return input.endsWith("*");
    }
    
    public static Boolean endTwoStars(String input) {

        return input.endsWith("**");
//
//        if (input.length() < 2) {
//            return false;
//        }
//        if (input.charAt(input.length() - 1) == '*' && input.charAt(input.length() - 2) == '*') {
//            return true;
//        }
//        return false;
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter to check if ends in *");
        String input = keyboard.nextLine();
        System.out.println(endStar(input));
        
        System.out.println("Enter to check if ends in **");
        String input2 = keyboard.nextLine();
        System.out.println(endTwoStars(input2));
    }

}
