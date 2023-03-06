/**
 * Griffin Murphy
 * CSC 104B
 */
import java.util.Scanner;
public class Player {
    private SlotMachine m;
    public Player() {
        m = new SlotMachine();
    }

    public void pushBetOne() {
        m.pushBetOne();
    }

    public void pushBetMax() {
        m.pushBetMax();
    }

    public void pushCoinOut() {
       m.pushCoinOut();
    }

    public void pushSpin() {
        m.pushSpin();
    }

    public void insertCoins(int n) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many coins would you like to enter");
        n = input.nextInt();
        m.insertCoins(n);
    }

    public void exitTheGame() {
        System.exit(1);
    }
}