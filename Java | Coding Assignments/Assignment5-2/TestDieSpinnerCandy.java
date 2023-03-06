/**
 * Griffin Murphy
 * CSC 104B
 */
import java.util.*;
import java.util.Scanner;
public class TestDieSpinnerCandy {
    public static void main(String[] args) {
        boolean stop = false;
        Scanner keyboard = new Scanner(System.in);
        while(!stop) {
            System.out.println("Which Method would you like to play? ");
            System.out.println("Enter 1 for Dice: ");
            System.out.println("Enter 2 for Spinner: ");
            System.out.println("Enter 3 for CandyCard: ");
            System.out.println("Enter 4 to quit: ");
            int input = keyboard.nextInt();
            if(input == 1) {
                Die.display();
            }
            if(input == 2) {
                Spinner.display();
            }
            if(input == 3) {
                CandyCard.display();
            }
            if(input == 0 || input > 4) {
                System.out.println("ERROR. Enter number between 1-3, or 4 to quit.");
                System.out.println("");
            }
            if(input == 4) {
                stop = true;
            }
        }
    }
}
