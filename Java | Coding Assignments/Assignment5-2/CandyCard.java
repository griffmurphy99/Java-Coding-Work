/**
 * Griffin Murphy
 * CSC 104B
 */
import java.util.*;
public abstract class CandyCard implements Move {
    private int num;
    public int spin() {
        Random r = new Random();
        int sum = 0;
        for (int i=1; i<=num; i++) {
            sum = sum + r.nextInt(4) + 1;
        }
        return sum;
    }

    public void setNum(int n) {
        num = n;
    }
    
    public int getNum() {
        return num;
    }

    public static void display() {
        int num = 1;
        Random r = new Random();
        int sum = 0;
        for (int i=1; i<=num; i++) {
            sum=sum+r.nextInt(4) +1;
        }
        System.out.println("---CANDYCARD---");
        switch(sum) {
            case 1:
            System.out.println("Color is: Blue");
            System.out.println("Code Number is 1");
            System.out.println("");
            break;
            case 2:
            System.out.println("Color is: Green");
            System.out.println("Code Number is 2");
            System.out.println("");
            break;
            case 3:
            System.out.println("Color is: Yellow");
            System.out.println("Code Number is 3");
            System.out.println("");
            break;
            case 4:
            System.out.println("Color is: Brown");
            System.out.println("Code Number is 4");
            System.out.println("");
            break;
            case 5:
            System.out.println("Color is: Pink");
            System.out.println("Code Number is 5");
            System.out.println("");
            break;
        }
    }
    
    public CandyCard() {
        num = 1;
    }

    public CandyCard(int n) {
        num = n;
    }
}