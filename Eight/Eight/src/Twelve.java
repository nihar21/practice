import java.util.Scanner;

public class Twelve {

    public static final double PRICE = 0.26;

    public static void main(String[] args) {



        while (true) {
            System.out.println("Enter quantity: ");
            Scanner keyboard = new Scanner(System.in);
            int i;
            while (true) {
                i = keyboard.nextInt();
                if (i % 25 != 0) {
                    System.out.println("Ripples can be ordered only in packs of 25.");
                } else {
                    break;
                }
            }


            System.out.printf("You have ordered %d Ripples -- $%.2f\n\n", i, PRICE * i);

            while (true) {
                System.out.println("Next customer (y/n)");

                char answer;

                String s = keyboard.next().trim();
                if (s.length() == 1) {
                    answer = s.charAt(0);
                } else {
                    answer = ' ';
                }

                if (answer == 'n') {
                    System.out.println("Thank you for using Ripple Systems.");
                    return;
                } else if (answer == 'y') {
                    break;
                }
            }
        }
    }

}
