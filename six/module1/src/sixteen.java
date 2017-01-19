import java.util.Scanner;

/**
 * Created by kitty on 1/17/17.
 */
public class sixteen {

    public static double calculateBMI(double weight, double height) {
        return weight * 0.454 / Math.pow(height * 0.0254, 2.0);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter height (in)");
        double height = keyboard.nextDouble();
        System.out.println("Enter weight (lbs)");
        double weight = keyboard.nextDouble();
        double BMI = calculateBMI(weight, height);
        System.out.println(BMI);
    }
}
