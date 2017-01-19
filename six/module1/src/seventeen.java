import java.util.Scanner;

/**
 * Created by kitty on 1/18/17.
 */
public class seventeen {

    public static double computeShippingCost(int nJars) {
        int nCartons = (nJars + 11) / 12;
        int totalOunces = 21 * nJars + 25 * nCartons;
        int lbs = (int)Math.ceil(totalOunces / 16.0);
        return lbs * 0.96 + 1.44 * nCartons + 3;

    }


    public static void main(String[] args) {
        System.out.println("Enter number of Jars");
        Scanner keyboard = new Scanner(System.in);
        int entry = keyboard.nextInt();
        System.out.println("$" + computeShippingCost(entry));
    }

}
