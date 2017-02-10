/**
 * Created by kitty on 2/10/17.
 */
public class Two {
    public static void main(String[] args) {
        int months = 0;
        double known = 0;
        while (known < 0.95) {
            known += (1 - known) * 0.1;
            months++;
        }
        System.out.println(months);
    }
}
