import java.util.Scanner;

/**
 * Created by kitty on 1/20/17.
 */
public class four {
    
    private static String dateStr(String input) {
        int f = input.indexOf('/');
        int l = input.lastIndexOf('/');

        String month = input.substring(0, f);
        String day = input.substring(f + 1, l);
        String year = input.substring(l + 1);

        if (month.length() == 1) {
            month = "0" + month;
        }
        if (day.length() == 1) {
            day = "0" + day;
        }

        return day + '-' + month + '-' + year;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter mm/dd/yyyy");
        Scanner keyboard = new Scanner(System.in);
        String date = keyboard.nextLine();
        System.out.println(dateStr(date));


        
    }
}
