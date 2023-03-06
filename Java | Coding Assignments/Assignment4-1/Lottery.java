
/**
 * Write a description of class Lottery here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Lottery {
    public static void main (String[] args) {
        int[] nums = {4,57,84,39,7,13,27,90, 40, 1, 6, 71};
        int[] friend1 = {4,57,84,39};
        int[] friend2 = {7, 13, 27};
        int[] friend3 = {90, 40, 1, 6, 71};
        IntegerSet one = new IntegerSet(friend1,4);
        IntegerSet two = new IntegerSet(friend2,3);
        IntegerSet three = new IntegerSet (friend3,5);
        Object merge;
        one.merge(two);
        two.merge(three);

        int cost1 = 400;
        int cost2 = 300;
        int cost3 = 500;
        int total = cost1 + cost2+ cost3;

        Random r = new Random(100);
        int winning = r.nextInt(100);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == winning) {
                System.out.println("Congrata you won: " + total + "$");
                break;
            }
            else {
                System.out.println("5orry you lost: " + total + "$");
                break;
            }
        }
    }
}
