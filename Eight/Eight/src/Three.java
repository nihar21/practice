import java.util.Scanner;

public class Three {

    public static int addOdds(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();

        System.out.println(addOdds(n));
    }


}
