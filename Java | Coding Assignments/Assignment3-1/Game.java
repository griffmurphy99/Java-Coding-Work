/**
 * Griffin Murphy
 * CSC 104B
 */
import java.util.Scanner;
public class Game {
  private Player player;
  public void play() {
        Player player = new Player();
      Scanner input = new Scanner(System.in);
      boolean done = false; 
        int opt;
        do {
            Option();
            opt = input.nextInt();
            switch(opt) {
                case 1:
                player.pushBetOne();
                break;
                case 2:
                player.pushBetMax();
                break;
                case 3:
                player.pushSpin();
                break;
                case 4:
                player.insertCoins(0);
                break;
                case 5:
                player.pushCoinOut();
                break;
                case 6:
                player.exitTheGame();
                done = true;
                System.exit(1);
                default:
                System.out.println("Not an option: ");
            }
        } while(!done);
    }

    public static void Option() {
        System.out.println("***Choose an option***");
        System.out.println("1. Push BetOne");
        System.out.println("2. Push BetMax");
        System.out.println("3. Push Spin");
        System.out.println("4. Insert Coins");
        System.out.println("5. Push CoinOut");
        System.out.println("6. Exit");
    }
}