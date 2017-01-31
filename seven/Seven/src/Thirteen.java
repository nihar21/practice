import java.util.Scanner;

/**
 * Created by kitty on 1/31/17.
 */
public class Thirteen {

    public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2) {
        if (year1 > year2) {
            return true;
        } else if (year1 < year2){
            return false;
        }
        if (month1 > month2) {
            return true;
        } else if (month1 < month2) {
            return false;
        }
        if (day1 > day2) {
            return true;
        } else if (day1 < day2) {
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter M1 D1 Y1 M2 D2 Y2");
        Scanner keyboard = new Scanner(System.in);
        
        int m1 = keyboard.nextInt();
        int d1 = keyboard.nextInt();
        int y1 = keyboard.nextInt();
        int m2 = keyboard.nextInt();
        int d2 = keyboard.nextInt();
        int y2 = keyboard.nextInt();
        
        System.out.println(isLater(m1, d1, y1, m2, d2, y2));
        
    }
    
}
