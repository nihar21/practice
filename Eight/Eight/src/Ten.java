import java.util.Scanner;

public class Ten {

    public static double sqrtEst(double a) {
        double x = a / 2;
        double diff;
        do {
            x = 0.5 * (x + a / x);
        } while (Math.abs(Math.pow(x, 2) - a) > 0.01);

        return x;
    }

    public static void main(String[] args) {
        System.out.println("Enter a");
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        System.out.println(sqrtEst(a));
    }

}
