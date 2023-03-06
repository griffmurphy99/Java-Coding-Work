/**
 * Griffin Murphy
 * CSC 104B
 */
import java.util.*;
public abstract class Spinner implements Move {
    private int num;
    public Spinner() {
        num=1;
    }

    public Spinner(int n) {
        num=n;
    }

    public int spin() {
        Random r= new Random();
        int sum=0;
        for (int i=1; i<=num; i++) {
            sum=sum+r.nextInt(5) +1;
        }
        return sum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int n) {
        num=n;
    }

    public static void display() {
        int num = 1;
        Random r= new Random();
        int sum=0;
        for (int i = 1; i <= num; i++) {
            sum = sum + r.nextInt(5) + 1;
        }
        System.out.println("---SPINNER---");
        System.out.println("Value is: " + sum);
        System.out.println("");
    }
}