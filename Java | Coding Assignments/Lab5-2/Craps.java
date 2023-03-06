/**
 * Griffin Murphy & Aiden Wilde
 */
public class Craps implements Playgame {
    private int bet; 
    public Craps() {
        bet = 0;
    }

    public Craps(int bet) {
        this.bet = bet;
    }

    public int getBet() {
        return bet;
    }

    public void play() {
        System.out.println("Playing Craps");
        int r = (int)(Math.random()*2);
        if (r == 0)
        {
            System.out.println("You lose " +bet);
        }
        else if (r == 1)
        {
            System.out.println("You win " +bet);
        }
    }
}