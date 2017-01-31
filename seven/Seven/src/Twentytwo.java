import java.util.Scanner;

/**
 * Created by kitty on 1/31/17.
 */
public class Twentytwo {

    public static String nextPlay(String choice1, String choice2) {
        switch(choice1) {
            case "rock":
                switch(choice2) {
                    case "rock":
                        return "Tie!";
                    case "paper":
                        return "Player 2 Wins!";
                    case "scissors":
                        return "Player 1 Wins!";
                }

            case "paper":
                switch(choice2) {
                    case "rock":
                        return "Player 1 Wins";
                    case "paper":
                        return "Tie!";
                    case "scissors":
                        return "Player 2 Wins!";
                }

            case "scissors":
                switch(choice2) {
                    case "rock":
                        return "Player 2 Wins!";
                    case "paper":
                        return "Player 1 Wins!";
                    case "scissors":
                        return "Tie!";
                }

        }
        return "Please only use the words rock paper and scissors!";

    }


    public static void main(String[] args) {

        System.out.println("Rock Paper Scissors");
        Scanner keyboard = new Scanner(System.in);
        String choice1 = keyboard.next().toLowerCase();
        String choice2 = keyboard.next().toLowerCase();
        System.out.println(nextPlay(choice1, choice2));


    }

}
