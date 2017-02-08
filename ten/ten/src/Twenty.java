import java.util.Scanner;

/**
 * Created by kitty on 1/26/17.
 */
public class Twenty {
    
    public static boolean isValidISBN(String isbn) {
        int sum = 0;
        for (int i = 0; i < isbn.length(); i++) {
            // Odd index is coefficient of 3
            if (i % 2 == 1) {
                sum += 3 * Character.digit(isbn.charAt(i), 10);
            } else {
                sum += Character.digit(isbn.charAt(i), 10);
            }
            System.out.println(isbn.charAt(i));
            System.out.println(sum);
        }
        return sum % 10 == 0;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter in ISBN");
        Scanner keyboard = new Scanner(System.in);
        String isbn = keyboard.nextLine();
        System.out.println(isValidISBN(isbn));
    }
    
}
