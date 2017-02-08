import java.util.Scanner;

/**
 * Created by kitty on 1/26/17.
 */
public class Eighteen {

    public static boolean isPalindrome(String word) {
        word = word.replace(",", "");
        word = word.replace(" ", "");
        word = word.replace(".", "");
        word = word.replace("'", "");
        word = word.replace("\"", "");
        StringBuffer wordName = new StringBuffer(word);
        String reverse = wordName.reverse().toString();
        return word.equalsIgnoreCase(reverse);
    }
    public static void main(String[] args) {
        
        System.out.println("Enter in a string to test palindrome");
        Scanner keyboard = new Scanner(System.in);
        String line = keyboard.nextLine();
        System.out.println(isPalindrome(line));
        
    }

}
