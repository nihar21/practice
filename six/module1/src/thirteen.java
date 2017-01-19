import java.util.Scanner;

/**
 * Created by kitty on 1/17/17.
 */
public class thirteen {
    public static void main(String[] args) {
        System.out.println("Enter N");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int units = n % 10;
        int tens = (n % 100 - units) / 10;
        System.out.println(n - (n % 100) + units * 10 + tens);
    }
}
