package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Luffy implements ActionListener {
    JLabel l1;
    Luffy(){
        JFrame f=new JFrame("JButton");
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800,800);
        
        ImageIcon i1=new ImageIcon("boahancock.png");
        JButton b1=new JButton(i1);
        b1.setActionCommand("BOA HANCOCK");
        b1.addActionListener(this);
        f.add(b1);

        ImageIcon i2=new ImageIcon("nami.jpeg");
        JButton b2=new JButton(i2);
        b2.setActionCommand("NAMI SWAN");
        b2.addActionListener(this);
        f.add(b2);

        ImageIcon i3=new ImageIcon("nico.jpeg");
        JButton b3=new JButton(i3);
        b3.setActionCommand("ROBIN CHWAN");
        b3.addActionListener(this);
        f.add(b3);

        ImageIcon i4=new ImageIcon("yamato.jpeg");
        JButton b4=new JButton(i4);
        b4.setActionCommand("YAMATO");
        b4.addActionListener(this);
        f.add(b4);
        l1=new JLabel("Waifu");
        f.add(l1);
        f.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        l1.setText("You selected "+ae.getActionCommand());
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new Luffy();
            }        });
    }
}
