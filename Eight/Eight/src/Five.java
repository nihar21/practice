import java.util.Scanner;

/**
 * Created by kitty on 2/10/17.
 */
public class Five {
    public static void main(String[] args) {
        System.out.print("Enter a positive integer under 10: ");
        Scanner keyboard = new Scanner(System.in);
        int i = keyboard.nextInt();
        int total = 0;
        for (int j = 1; j < i; j++) {
            System.out.print(j + " + ");
            total += j;
        }
        total += i;
        System.out.print(i + " = " + total);

        
    }
}
