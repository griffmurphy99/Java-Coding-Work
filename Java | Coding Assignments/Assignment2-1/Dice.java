/**
 * Griffin Murphy
 * CSC 104B
 */
import java.util.*;
public class Dice {
    private int numDice;
    public Dice() {
        // default constructor, a single die
        numDice = 1;
    }

    public Dice (int n) {
        numDice= n;
    }

    public int rollDice() {
        //one-argument constructor
        // rolls numDice dice and returns the sum of the spots
        Random r = new Random();
        int sum = 0;
        for (int i = 1; i<= numDice; i++)
        // nextlnt (6) returns 0 ...5
            sum = sum + r.nextInt(6) + 1;
        return sum;
    }

    public int getNumDice() { //a getter
        return numDice;
    }

    public void setNumDice(int n) { //a setter
        numDice = n;
    }
}