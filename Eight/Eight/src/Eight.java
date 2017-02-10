import java.util.Scanner;

public class Eight {

    public static int sumDigits(int n) {

        int total = 0;

        String s = Integer.toString(n);
        for (Character c : s.toCharArray()) {
            total += Character.getNumericValue(c);
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Enter in the number");
        Scanner keyboard = new Scanner(System.in);
        int i = keyboard.nextInt();
        System.out.println(sumDigits(i));
    }

}
