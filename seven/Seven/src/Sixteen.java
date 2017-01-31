import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by kitty on 1/31/17.
 */
public class Sixteen {

    public static double getOrderTotal(int bp, int nb) {
        int copies = bp + nb;
        if (copies >= 12) {
            return copies * 14.00;
        }
        if (copies >= 3) {
            return copies * 15.95;
        }

        double total = 0;
        int min = Math.min(bp, nb);
        int difference = Math.abs(bp - nb);
        total += min * 37.95;
        if (bp == nb) {
            return total;
        }
        if (min == bp) {
            total += 21.95 * (nb - bp);
        } else if (min == nb) {
            total += 18.95 * (bp - nb);
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Enter bp nb");
        Scanner keyboard = new Scanner(System.in);
        int bp = keyboard.nextInt();
        int nb = keyboard.nextInt();

        DecimalFormat dollarize = new DecimalFormat("$0.00");

        System.out.println(dollarize.format(getOrderTotal(bp, nb)));

    }

}
