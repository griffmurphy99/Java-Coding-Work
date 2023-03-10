/**
 * Griffin Murphy
 * CSC 104B
 */
public class Card {
    private int suit; //0 Hearts, 1 = Diamonds, 2 Clubs, 3 = Spades
    private int rank; // 1 through 13 (Ace is 1, Jack 11, Queen 12, King 13)
    public Card() { //default constructor, sets Card to Ace of Hearts
        suit = 0; // Ace
        rank = 1; //Hearts
    }

    public Card (int s, int r) { // two argument constructor
        suit = s;
        rank = r;
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        String name = "";
        switch(rank) {
            case 1: name = "Ace of "; break;
            case 11: name = "Jack of "; break;
            case 12: name = "Queen of "; break;
            case 13: name = "King of"; break;
            default:name = rank +" of "; // 2,3,4,5,6,7,8,9, 10
        }
        switch(suit) {
            case 0: name = name + "Hearts"; break;
            case 1: name = name + "Diamonds"; break;
            case 2: name = name + "Clubs"; break;
            case 3: name = name + "Spades"; break;
        }
        return name;
    }
}