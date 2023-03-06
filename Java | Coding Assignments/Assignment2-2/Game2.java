/**
 * Griffin Murphy
 * CSC 104B
 */
public class Game2 {
    private static int numPiles;    // number of piles
    private static int piles[] = new int[10];     // an array holding the number of sticks in each pile
   
    public Game2(int num, int[] sticks) {
        numPiles = num;
        for(int i = 0; i < numPiles; i++ ) {
            piles[i] = sticks[i];
        }
    }

    public void remove(int pile, int numSticks) { // pile is pile number, numSticks is how many to remove
        piles[pile] = piles[pile] - numSticks;
        gameOver();
    }

    public void printPiles() {  // prints the pile number and the number of sticks currently in a pile.
        for(int i = 0; i < numPiles; i++ )
            System.out.println("Pile " + i + ": " + piles[i] + " sticks");
    }
    
    public boolean gameOver() {
        int counter = 1;
        for(int i = 0; i < numPiles; i++ ) {
            if (piles[i] != 0) {
                    return false;
                }
            }
        return true;     
    }
}