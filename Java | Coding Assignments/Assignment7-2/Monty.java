/**
 * Griffin Murphy
 * CSC 104B
 */
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Monty extends JFrame {
    private JButton resetButton;
    private JButton exitButton;
    private JButton keep;
    private JButton change;
    private JButton[] door;
    private int choice;
    private String option;
    Random rand = new Random();
    private int randomVal = rand.nextInt(3);
    public Monty() {
        super("Monty Hall");
        setBounds(0,0,400,300);
        resetButton = new JButton("Reset");
        exitButton = new JButton("Exit");
        keep = new JButton("Keep");
        change = new JButton("Change");
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(resetButton);
        bottomPanel.add(exitButton);
        bottomPanel.add(keep);
        bottomPanel.add(change);
        JPanel doorPanel = new JPanel();
        doorPanel.setLayout(new GridLayout(1,3));
        door = new JButton[3];
        for(int i = 0; i < 3; i++) {
            door[i] = new JButton("Door " + (i+1));
            door[i].setFont(new Font("Arial",Font.BOLD, 14));
            doorPanel.add(door[i]);
        }
        add(bottomPanel,BorderLayout.SOUTH);
        add(doorPanel,BorderLayout.CENTER);
        resetButton.addActionListener(new ButtonListener());
        exitButton.addActionListener(new ButtonListener());
        keep.addActionListener(new ButtonListener());
        change.addActionListener(new ButtonListener());
        for(int i = 0; i < 3; i++) 
            door[i].addActionListener(new ButtonListener());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int turn = 0;
            System.out.println(randomVal);
            if(e.getSource() == exitButton) {
                System.exit(0);
            }
            else if(e.getSource() == door[0]) {
                choice = 0;
            }
            else if(e.getSource() == door[1]) {
                choice = 1;
            }
            else if(e.getSource() == door[2]) {
                choice = 2; 
            }
                 int other = (randomVal+1) % 2;
                door[other].setText("X");
                if (e.getSource() == keep && choice == randomVal) { 
                    door[choice].setText("Car1"); }
                    else {
                    door[choice].setText("Goat1"); 
                }
                 if (e.getSource() == change && randomVal != choice) {
                    door[randomVal].setText("Car2"); }
                    else {
                     door[randomVal].setText("Goat2"); 
                    }
            if(e.getSource() == resetButton) {
                for(int i = 0; i < 3; i++) {
                    door[i].setText("Door " + (i+1));
                    randomVal = rand.nextInt(3);
                    choice = 0;
                }
            }
        }
    }
    public static void main(String args[]) {
        Monty frame= new Monty();
    }
}

