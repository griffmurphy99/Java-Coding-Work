/**
 * Griffin Murphy
 * CSC 104B
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Faces extends JFrame {
    private JButton homer = new JButton("Homer");
    private JButton bart = new JButton("Bart");
    private JButton marge = new JButton("Marge");
    private JLabel picture = new JLabel();
    private JLabel west = new JLabel("                     ");   
    private JLabel east = new JLabel("                  ");  
    private JLabel bottom = new JLabel();
    public Faces() {
        super("Faces");
        setBounds(0,0,450,350);
        JPanel top = new JPanel();
        top.add(homer);
        top.add(marge);
        top.add(bart);
        add(top, BorderLayout.NORTH);
        picture.setIcon(new ImageIcon("simpsons.png"));
        bottom.setText("                     Click buttoms at top to view picture and dscription");
        add(west, BorderLayout.WEST);
        add(east, BorderLayout.EAST);
        add(bottom, BorderLayout.SOUTH);
        add(picture, BorderLayout.CENTER);
        homer.addActionListener(new ButtonHandler());
        bart.addActionListener(new ButtonHandler());
        marge.addActionListener(new ButtonHandler());
    }

        public static void main(String[] args) {
        JFrame pic = new Faces();
        pic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pic.setVisible(true);
    }

    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == homer) {
                picture.setIcon(new ImageIcon("homer.jpg"));
                homer.setEnabled(false);
                bart.setEnabled(true);
                marge.setEnabled(true);
                bottom.setText("                         Someone say donuts");
                repaint();
            }
            else if(e.getSource() == bart) {
                picture.setIcon(new ImageIcon("bart.jpg"));
                homer.setEnabled(true);
                bart.setEnabled(false);
                marge.setEnabled(true);
                bottom.setText("                       no chance im doing CS homework");
                repaint();
            }
            else if(e.getSource() == marge) {
                picture.setIcon(new ImageIcon("marge.jpg"));
                homer.setEnabled(true);
                bart.setEnabled(true);
                marge.setEnabled(false);
                bottom.setText("                         kids go clean your rooms");
                repaint();
            }
            else {
                System.exit(0);
            }
        }
    }
}