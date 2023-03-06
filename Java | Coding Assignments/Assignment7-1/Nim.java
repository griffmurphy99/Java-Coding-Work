/**
 * Griffin Murphy
 * CSC 104B
 */
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.awt.event.*;
import java.util.Random;
public class Nim extends JFrame {
    private int choice;
    private int numSticks=50;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel sticks;
    private JPanel mpanel;
    private int numWins = 0;
    private int numGames = 0;
    public Nim(int choice) {
        Random r=new Random();
        setTitle("123-Nim");
        setBounds(0,0,400,400);
        setBackground(Color.WHITE);
        this.numSticks=numSticks;
        String stx=new String(" "+ numSticks);
        this.sticks=new JLabel(stx);
        this.mpanel=new JPanel();
        mpanel.add(sticks);
        button1=new JButton("P1:1 Stick");
        button2=new JButton("P1:2 Sticks");
        button3=new JButton("P1:3 Sticks");
        JPanel lpanel=new JPanel();
        JPanel rpanel=new JPanel();
        lpanel.add(button1);
        lpanel.add(button2);
        lpanel.add(button3);
        add(mpanel,BorderLayout.CENTER);
        add(lpanel,BorderLayout.WEST);
        button1.addActionListener(new ButtonHandler());
        button2.addActionListener(new ButtonHandler());
        button3.addActionListener(new ButtonHandler()); 
        playGame();
    }

    public void updateLabel() {
        sticks.setText(""+numSticks);
    }

    public void computerTurn() {
        Random r=new Random();
        int n=numSticks%4;
        if(n==0) {
            int x=(int)r.nextInt(3)+1;
            numSticks=numSticks-x;
            System.out.println("Computer took "+n+" Sticks");
            updateLabel();
            isWinner(false);}
        else {
            numSticks=numSticks-n;
            System.out.println("Computer took "+n+" Sticks");

            updateLabel();
            isWinner(false);
        }
    }

    public void newGame() {
        this.numSticks = 50;
        updateLabel();
        playGame(); 
    }

    public boolean isWinner(boolean turn) {
        if(numSticks==0) {
            if(turn==true) {
                boolean answer=popup("You win! would you like to play again?");
                this.numWins=numWins+1;
                numGames++;
                if(answer==true) {
                    newGame(); }
                return true; }
            else if(turn==false) {
                boolean answer2=popup("You Lose. would you like to play again");
                numGames++;
                if(answer2==true) {
                    newGame(); }
                return true; }
        }
        return false; }

    public boolean popup(String message) {
        int reply=JOptionPane.showConfirmDialog(null,message,"Turn", JOptionPane.YES_NO_OPTION);
        if(reply==JOptionPane.YES_OPTION) {
            return true; }
        else {
            return false; }
    }

    public void playGame() {
        boolean answ=popup("Do you want to play first");
        if(answ==false)
            computerTurn();
    }
    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==button1) {
                button1.setEnabled(true);
                numSticks=numSticks-1;
                updateLabel();
                if(isWinner(true)==false) {
                    computerTurn();  
                }
            }
            else if(e.getSource()==button2) {
                button2.setEnabled(true);
                numSticks=numSticks-2;
                updateLabel();
                isWinner(true);
                if(isWinner(true)==false) {
                    computerTurn();  
                }
            }
            else if(e.getSource()==button3) {
                button3.setEnabled(true);
                numSticks=numSticks-3;
                updateLabel();
                isWinner(true);
                if(isWinner(true)==false) {
                    computerTurn();  
                }
            }
        }
    }
}