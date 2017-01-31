import java.util.Scanner;

/**
 * Created by kitty on 1/31/17.
 */
public class Four {
    
    public static double totalWages(double hours, double rate) {
        double wages;
        
        wages = hours * rate;
        
        if (hours > 40) {
            wages += (hours - 40) * 1.5 * rate;
        }
        
        return wages;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter hours and rate");
        Scanner keyboard = new Scanner(System.in);
        Double hours = keyboard.nextDouble();
        Double rate = keyboard.nextDouble();
        System.out.printf("%.2f", totalWages(hours, rate));
    }
    
}
