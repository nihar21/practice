import java.util.Scanner;

/**
 * Created by kitty on 1/18/17.
 */
public class eighteen {

    public static int convertToHumanAge(int dogYears) {
        if (dogYears == 1) {
            return 13;
        }
        return (int) Math.round((dogYears - 1) * 16 / 3.0) + 13;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("DogYears");
        int dy = keyboard.nextInt();
        System.out.println(convertToHumanAge(dy));
    }
}
