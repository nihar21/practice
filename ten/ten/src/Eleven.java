import java.util.Scanner;

/**
 * Created by kitty on 1/25/17.
 */
public class Eleven {

    public static String cutOut(String mString, String sub) {
        final int index = mString.indexOf(sub);
        return mString.substring(0, index) + mString.substring(index + sub.length());
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter cutOut string");
        String mLine = keyboard.nextLine();
        System.out.println("Enter substring string");
        String mSub = keyboard.nextLine();
        System.out.println(cutOut(mLine, mSub));
    }

}
