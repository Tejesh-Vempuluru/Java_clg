package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Icon {
 Icon(){
  JFrame f=new JFrame("Yokoso watashino Soul Society");
  f.setLayout(new FlowLayout());
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.setSize(500,500);
  ImageIcon i=new ImageIcon("download.jpeg");
  JLabel l=new JLabel("Roronoa Zoro",i,JLabel.CENTER);
  f.add(l);
  f.setVisible(true);
} 
 public static void main(String[] args){
    SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        new Icon();
      }
    });
 }
}
