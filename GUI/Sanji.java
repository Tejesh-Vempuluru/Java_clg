package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
 class Sanji extends JFrame implements ActionListener{
   JTextField t1,t2,t3;
   JButton b1;
   JLabel l1,l2;
   Sanji(){
    setLayout(new FlowLayout());
    t1=new JTextField(10);
    t2=new JTextField(20);
    t3=new JTextField(20);
    b1=new JButton("Submit");
    l1=new JLabel("Username");
    l2=new JLabel("Password");
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(b1);
    add(t3);
    setSize(400,400);
    setVisible(true);
    b1.addActionListener(this);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }


    public void actionPerformed(ActionEvent ae){
        String s1 = t1.getText();
        String s2 = t2.getText();
        if(s1.equals("Nami")&& s2.equals("swan"))
        t3.setText("Sanji");
        else
        t3.setText("Genji");


    }
    public static void main(String[] args) {
        Sanji s=new Sanji();
    }
}
