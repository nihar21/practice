import java.util.Scanner;

public class Sixteen {

    public static void coins(int cents) {
        for (int q = 0; q <= cents / 25; q++) {
            for (int d = 0; d <= cents / 10; d++) {
                for (int n = 0; n <= cents / 5; n++) {
                    for (int p = cents % 5; p <= cents; p += 5) {
                        if (25 * q + 10 * d + 5 * n + p == cents) {
                            System.out.println(cents + " cents = " + q + " quarters + " + d + " dimes + " + n + " nickels + " + p + " pennies");
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int amt = keyboard.nextInt();
        coins(amt);
    }


}
