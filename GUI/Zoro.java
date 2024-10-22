package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Zoro implements ActionListener {
    JFrame f;
    JLabel l1, l2;
    JTextField t1, t2, t3;
    JButton b1;

    Zoro() {
        f = new JFrame("Complete Dialouge");
        l1 = new JLabel("Randira Randira ");
        l2 = new JLabel("Vallu raru ra ");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        b1 = new JButton("Submit");

        f.setLayout(new FlowLayout());
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(t3);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String username = t1.getText();
        String password = t2.getText();
        
        // Make sure to check the password as a string
        if (username.equals("Kya Randi ra") && password.equals("vallu Thagedhi")) {
            t3.setText("Baavuji uccha ra");
        } else {
            t3.setText("Shabash Chellama");
        }
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new Zoro());
    }
}