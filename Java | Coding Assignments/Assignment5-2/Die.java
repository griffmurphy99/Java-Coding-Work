/**
 * Griffin Murphy
 * CSC 104B
 */
import java.util.*;
public abstract class Die implements Move {
    private int numDice; 
    public Die() {
        numDice=1;
    }

    public Die(int n) {
        numDice=n;
    }

    public int getNumDice() {
        return numDice;
    }

    public void setNumDiuce(int n) {
        numDice=n;
    }

    public int rollDice() {
        Random r = new Random();
        int sum=0;
        for (int i=1; i<=numDice; i++) {
            sum=sum+r.nextInt(6) +1;
        }
        return sum;
    }

    public static void display() {
        int Dice = 1;
        Random r = new Random();
        int tot = 0;
        for (int i = 1; i <= Dice; i++) {
            tot = tot + r.nextInt(6) + 1;
        }
        System.out.println("---DICE---");
        System.out.println("Value is: " + tot);
        System.out.println("");
    }
}