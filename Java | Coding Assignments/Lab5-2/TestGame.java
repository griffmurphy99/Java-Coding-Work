/**
 * Griffin Murphy & Aiden Wilde
 */
import java.util.*;
public class TestGame {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        do {
            Playgame game;
            System.out.println("What game would you like to play?");
            System.out.println("P: Poker");
            System.out.println("B: Blackjack");
            System.out.println("C: Craps");
            String letter = input.next();
            if (!((letter.equals("P")||letter.equals("B")||letter.equals("C")))) {
                System.out.println();
                System.out.println("Cya!");
                return;
            }
            System.out.println("What is your bet?");
            int Bet = input.nextInt();
            if (letter.equals("P")) {
                game = new Poker(Bet);
            }
            else if (letter.equals("B")) {
                game = new Blackjack(Bet);
            }
            else {
                game = new Craps(Bet);
            }
            game.play();
            System.out.println();
        }
        while (true);
    }
}