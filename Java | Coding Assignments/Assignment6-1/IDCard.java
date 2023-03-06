/**
 * Griffin Murphy
 * CSC 104B
 */
import javax.swing.*;
import java.awt.*;
public class IDCard extends JFrame {
    public IDCard() {
        setTitle("ID Card");
        setBounds(0,0,250,150);
        JLabel bottom = new JLabel("                  JAVA PROGRAMMER");
        JLabel top = new JLabel("                      Griffin Murphy");
        JPanel right = new JPanel(new GridLayout(3,1,5,10));
        JLabel ht = new JLabel("Height: 6ft3in");
        JLabel wt = new JLabel("Weight: 220");
        JLabel eye = new JLabel("Eyes: Blue");
        JPanel left = new JPanel(new GridLayout(3,1,5,10));
        JLabel address = new JLabel("7 Oriole Rd");
        JLabel town = new JLabel("Medfield");
        JLabel state = new JLabel("Massachusetts");  
        right.add(ht);
        right.add(wt);                             
        right.add(eye);                          
        left.add(address); 
        left.add(town); 
        left.add(state);  
        add(top, BorderLayout.NORTH);
        add(bottom, BorderLayout.SOUTH);
        add(right, BorderLayout.EAST); 
        add(left, BorderLayout.WEST);     
        add(new JLabel(new ImageIcon("self.jpg")),BorderLayout.CENTER);
    }

    public static void main (String[]args) {
        JFrame frame= new IDCard();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}