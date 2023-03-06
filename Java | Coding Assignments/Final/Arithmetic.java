/**
 * Griffin Murphy
 * CS2 Final
 */
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class Arithmetic extends JFrame {
    private JTextField firstnumField;
    private String num;
    private int right;
    private int wrong;
    private JButton problem;
    private JButton submit;
    private JButton exit;
    private String sum;
    private JLabel question = new JLabel();
    private int randomNumber1 =  (int)(10 * Math.random()) + 1;
    private int randomNumber2 =  (int)(10 * Math.random()) + 1;
    private int randomNumberAdd = randomNumber1 + randomNumber2;

    public Arithmetic() {
        super("Arithmetic Test");
        setBounds(150,150,300,150);
        JPanel panel= new JPanel();

        question.setText("Arithmetic Quiz");
        firstnumField= new JTextField(20);
        firstnumField.setEditable(true);
        add(question, BorderLayout.NORTH);
        panel.add(firstnumField);
        add(panel,BorderLayout.CENTER);

        JPanel south=new JPanel();
        problem = new JButton ("Problem");
        submit = new JButton ("Submit");
        exit = new JButton ("Exit");
        south.add(problem);
        south.add(submit);
        south.add(exit);
        add(south,BorderLayout.SOUTH);

        firstnumField.addActionListener(new ButtonHandler());
        problem.addActionListener(new ButtonHandler());
        submit.addActionListener(new ButtonHandler());
        exit.addActionListener(new ButtonHandler());
    }

    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == exit) { 
                JOptionPane.showMessageDialog(null, "Right: " + right + " Wrong: " + wrong, "Arithmetic", 0);
                System.exit(0);
            }
            else if (e.getSource() == problem) {
                firstnumField.setText("");
                question.setText(randomNumber1 + " + " + randomNumber2 + " = ?");
                repaint();
            } 
            else if (e.getSource() == submit) {
                String num = firstnumField.getText();
                int ans = Integer.parseInt(num);
                if (ans == randomNumberAdd){
                    JOptionPane.showMessageDialog(null, "Correct", "Arithmetic", 0);
                    right++;
                }
                else {
                    JOptionPane.showMessageDialog(null, "InCorrect", "Arithmetic", 0);
                    wrong++;
                }
            }
        }
    }
    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        a.setVisible(true);
        a.setResizable(false);
    }
}