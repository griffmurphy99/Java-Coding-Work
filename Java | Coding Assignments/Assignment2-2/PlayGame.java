/**
 * Griffin Murphy
 * CSC 104B
 */
import java.util.Scanner;
public class PlayGame {
    private String P1; 
    private String P2; // names of the players
    private int turn; // whose turn player 1 or player 2, initially 1
    private Game2 game2; // a Game object (actually a reference to a Game object)
    private Scanner input;
    static int pile = 0;
    static int numSticks = 0;

    public PlayGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("Player 1 name: ");
        P1 = input.nextLine();
        System.out.println("Player 2 name: ");
        P2 = input.nextLine();
        turn = 1;
        System.out.println("How many piles in the game: ");
        int numPiles = input.nextInt();
        System.out.println("How many how many sticks per pile: ");
        int []piles = new int[numPiles];
        for(int i = 0; i < numPiles; i++ ) {
            System.out.print("Pile " + i + ": ");
            piles[i] = input.nextInt();
        }
        System.out.println();
        game2 = new Game2(numPiles, piles);
    }

    public void play() {
        Scanner input = new Scanner(System.in);
        String pturn = "";
        do{
            if(turn%2 != 0) {
                pturn = P1;
                turn = turn + 1;
            }
            else if(turn%2==0) {
                pturn = P2;
                turn = turn -1;
            }
            game2.printPiles();
            int player = 1;
            System.out.print(pturn + "'s turn. Enter the pile you want to take from: ");
            pile = input.nextInt();
            System.out.print("How many sticks would you like to take: ");
            numSticks = input.nextInt();
            game2.remove(pile, numSticks);
            if(game2.gameOver() == true) {
            System.out.println(pturn + " Won!");
            PlayGame game2 = new PlayGame();
        }
        }while(game2.gameOver() != true);
    }

    public static void main(String[] args){
        PlayGame game2 = new PlayGame();
        game2.play();
    }

}