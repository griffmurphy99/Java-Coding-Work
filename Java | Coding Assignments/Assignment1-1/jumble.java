/**
 * Griffin Murphy
 * CSC 104B
 */
import java.util.Scanner;
import java.util.*;
public class jumble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word use XXX to end the program: ");
        String word = input.nextLine();
        while (!word.equals("XXX")) {
            System.out.println("The jumbled word is "+jumble(word));
            System.out.print("Enter a word use XXX to end the program: ");
            word = input.nextLine();  
        }
    }

    public static String jumble(String word) {
        Random r = new Random();
        StringBuilder sb = new StringBuilder(word); 
        int l = word.length();
        int num = r.nextInt(l);
        sb.setCharAt(0, word.charAt(num));
        sb.setCharAt(num, word.charAt(0));
        for (int i = 0; i < 10; i++) {
            String str = new String(sb);
            num = r.nextInt(l);
            sb.setCharAt(0, str.charAt(num));
            sb.setCharAt(num, str.charAt(0));
        }
        return sb.toString(); 
    }
}