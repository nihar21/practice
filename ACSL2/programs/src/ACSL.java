/**
 * @(#)ACSL.java
 *
 *
 * @author
 * @version 1.00 2017/2/7
 */
import java.util.Scanner;

public class ACSL {


    public ACSL(){

    }

    public static void shave(long min, String s) {

        // System.out.println("min: " + min + " s: " + s);

        int i = 1;
        while (true) {

            String test = "";

            try {
                test = s.substring(0, i);
            } catch (StringIndexOutOfBoundsException e) {
                return;
            }


            long tInt = Integer.parseInt(test);


            if (tInt > min) {
                System.out.print(test + " ");

                StringBuffer sb = new StringBuffer(s.substring(i));
                sb.reverse();
                String rTest = sb.toString();

                // Make sure rTest is not empty
                if (rTest.length() > 0)	{
                    // Trim zeroes
                    // rTest = Integer.toString(Integer.parseInt(rTest));
                    while (rTest.charAt(0) == '0') {
                        rTest = rTest.substring(1);
                        if (rTest.length() == 0) {
                            return;
                        }
                    }

                    shave(tInt, rTest);

                }

                return;

            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("\n");
            System.out.println("ENTER STRING");
            Scanner keyboard = new Scanner(System.in);
            String input = keyboard.nextLine();

            // Start out with the first
            shave(0, input);
        }

    }


}
