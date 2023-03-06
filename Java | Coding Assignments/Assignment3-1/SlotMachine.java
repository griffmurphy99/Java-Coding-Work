/**
 * Griffin Murphy
 * CSC 104B
 */
import java.util.*;
public class SlotMachine {
    private int totCoins;
    private int currentBet;
    private int winnings;
    private Scanner input;
    public void pushBetOne() {
        if(totCoins == 0){
            System.out.println("Balance is 0  - add more coins to continue playing");
            return;
        }
        totCoins--;
        currentBet++;
        System.out.println("Current bet: " + currentBet);
    }

    public void pushBetMax() {
        if(totCoins < 3){
            System.out.println("Balance is: " + totCoins + " - add more coins to continue playing");
            return;
        }
        totCoins = totCoins - 3;
        currentBet = 3;
        System.out.println("Current bet: " + currentBet);
    }

    public void insertCoins(int n) { 
        totCoins = totCoins + n;
        System.out.println("Balance is: " + totCoins);
        System.out.println();
    }

    public void pushSpin() {
        if (currentBet == 0) {
            System.out.println("Cannot spin if no bet was made");
            return;
        }
        String trip7 = "777";
        String seven = " 7 ";
        String trip$ = "$$$";
        String dub$ = " $$";
        String money$ = " $ ";
        String cherry = " @ ";
        Random r = new Random();
        int row1 = r.nextInt(17);
        int row2 = r.nextInt(17);
        int row3 = r.nextInt(17);
        if (row1 == 0) 
            System.out.print(" | " + trip7 + " | ");
        else if (row1 > 0 && row1 < 3) 
            System.out.print(" | " + seven + " | ");
        else if (row1 > 2 && row1 < 6) 
            System.out.print(" | " + trip$ + " | ");
        else if (row1 > 5 && row1 < 10) 
            System.out.print(" | " + dub$ + " | ");
        else if (row1 > 9 && row1 < 15) 
            System.out.print(" | " + money$ + " | ");
        else if (row1 > 14 && row1 < 18) 
            System.out.print(" | " + cherry + " | ");

        if (row2 == 0) 
            System.out.print(trip7 + " | ");
        else if (row2 > 0 && row2 < 3) 
            System.out.print(seven + " | ");
        else if (row2 > 2 && row2 < 6) 
            System.out.print(trip$ + " | ");
        else if (row2 > 5 && row2 < 10) 
            System.out.print(dub$ + " | ");
        else if (row2 > 9 && row2 < 15) 
            System.out.print(money$ + " | ");
        else if (row2 > 14 && row2 < 18) 
            System.out.print(cherry + " | ");

        if (row3 == 0) 
            System.out.print(trip7 + " | ");
        else if (row3 > 0 && row3 < 3) 
            System.out.print(seven + " | ");
        else if (row3 > 2 && row3 < 6) 
            System.out.print(trip$ + " | ");
        else if (row3 > 5 && row3 < 10) 
            System.out.print(dub$ + " | ");
        else if (row3 > 9 && row3 < 15) 
            System.out.print(money$ + " | ");
        else if (row3 > 14 && row3 < 18) 
            System.out.print(cherry + " | ");

        System.out.println();

        if (row1 == 0 && row2 == 0 && row3 == 0) {
            winnings = currentBet * 200;
            System.out.println("You won " + winnings + " coins");
            totCoins = totCoins + winnings;
        }
        else if ((row1 > 0 && row1 < 3) && (row2 > 0 && row2 < 3) && (row3 > 0 && row3 < 3)) {
            winnings = currentBet * 50;
            System.out.println("You won " + winnings + " coins");
            totCoins = totCoins + winnings;
        }
        else if ((row1 > 2 && row1 < 6) && (row2 > 2 && row2 < 6) && (row3 > 2 && row3 < 6)) {
            winnings = currentBet * 30;
            System.out.println("You won " + winnings + " coins");
            totCoins = totCoins + winnings;
        }
        else if ((row1 > 5 && row1 < 10) && (row2 > 5 && row2 < 10) && (row3 > 5 && row3 < 10)) {
            winnings = currentBet * 20;
            System.out.println("You won " + winnings + " coins");
            totCoins = totCoins + winnings;
        }
        else if ((row1 > 9 && row1 < 15) && (row2 > 9 && row2 < 15) && (row3 > 9 && row3 < 15)) {
            winnings = currentBet * 15;
            System.out.println("You won " + winnings + " coins");
            totCoins = totCoins + winnings;
        }
        else if ((row1 > 14 && row1 < 18) && (row2 > 14 && row2 < 18) && (row3 > 14 && row3 < 18)) {
            winnings = currentBet * 10;
            System.out.println("You won " + winnings + " coins");
            totCoins = totCoins + winnings;
            return;
        }
        if ((row1 > 14 && row1 < 18) && (row2 > 14 && row2 < 18)) {
            winnings = currentBet * 5;
            System.out.println("You won " + winnings + " coins");
            totCoins = totCoins + winnings;
            return;
        }
        if ((row2 > 14 && row2 < 18) && (row3 > 14 && row3 < 18)) {
            winnings = currentBet * 5;
            System.out.println("You won " + winnings + " coins");
            totCoins = totCoins + winnings;
            return;
        }
        else if ((row1 > 14 && row1 < 18)) {
            winnings = currentBet * 2;
            System.out.println("You won " + winnings + " coins");
            totCoins = totCoins + winnings;
        }
        else if ((row2 > 14 && row2 < 18)) {
            winnings = currentBet * 2;
            System.out.println("You won " + winnings + " coins");
            totCoins = totCoins + winnings;
        }
        else if ((row3 > 14 && row3 < 18)) {
            winnings = currentBet * 2;
            System.out.println("You won " + winnings + " coins");
            totCoins = totCoins + winnings;
        }
        else {
            System.out.println("You didnt win");
        }
        System.out.println("Balance is: " + totCoins);
        System.out.println("Your bet was: " + currentBet);
        System.out.println();
        currentBet = 0;
    }

    public void pushCoinOut() {
        System.out.println("Returned coins: " + totCoins);
        totCoins = 0;
    }
}