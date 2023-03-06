/**
 * Griffin Murphy
 * CSC 104B
 */
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.awt.event.*;
public class testNim {
   public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Would you like to go first or second(1 or 2)? ");
        int choice=input.nextInt(); 
        JFrame f =new Nim(choice);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
