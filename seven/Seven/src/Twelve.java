import java.util.Scanner;

/**
 * Created by kitty on 1/31/17.
 */
public class Twelve {

    public static Boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        if (year % 4 == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter Year");
        Scanner keyboard = new Scanner(System.in);
        int year = keyboard.nextInt();

        System.out.println(isLeapYear(year));

    }

}
