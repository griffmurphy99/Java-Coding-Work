/**
 * Griffin Murphy
 * CSC 104B
 */
import java.util.Scanner;
public class Game {
    public static Scanner input = new Scanner(System.in);
    static int numGames;
    static int numWon;
    static int numLost;
    public static void main(String[] args) {
        boolean done = false;
        Game game = new Game(); 
        int opt;
        do {
            Option();
            opt = input.nextInt();
            switch(opt) {
                case 1:
                game.play();
                break;
                case 2:
                done = true;
                game.reportResults();
                default:
                System.out.println();
            }
        } while(!done);
    }

    public static void Option() {
        System.out.println("***Choose an option***");
        System.out.println("1. Play Game");
        System.out.println("2. Quit");
    }

    public static void play() {
        int total = 0;
        int sum = 0;
        Deck deck = new Deck();
        deck.shuffle();
        numGames++;
        Dice die = new Dice();
        int rollValue = die.rollDice();
        int rollValue2 = die.rollDice();
        sum = rollValue + rollValue2;
        System.out.println("You rolled a: " + sum); 
        System.out.println("Your cards and scores are:"); 
        for (int i = 0; i < sum; i++) {
            int score = 0;
            Card card = deck.dealCard();
            int suit = card.getSuit(); //0 Hearts, 1 = Diamonds, 2 Clubs, 3 = Spades
            int rank = card.getRank(); // 1 through 13 (Ace is 1, Jack 11, Queen 12, King 13)
            String name = card.getName();
            if (suit == 0 || suit == 1) {
                score = rank - (rank*2);
            }
            else {
                score = rank; 
            }
            System.out.println(name + "  " + score);
            total = total + score;
        }
        System.out.println();
        System.out.println("Total:  " + total);
        if(total > -1) {
            System.out.println("You win your score is positive!");
            System.out.println();
            numWon++;
        }
        else {
            System.out.println("You lost your score is negative");
            System.out.println();
            numLost++;
        }
    }

    public static void reportResults() {
        System.out.println("games played: " + numGames);
        System.out.println("games won: " + numWon);
        System.out.println("games Lost: " + numLost);
    }
}

    