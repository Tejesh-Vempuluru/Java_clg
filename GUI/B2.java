package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class B2{
    B2(){
        JFrame f=new JFrame("Text Field");
        f.setLayout(new FlowLayout());
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JToggleButton j= new JToggleButton("ON/OFF");
        j.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ae){
                if(j.isSelected())
                   j.setText("Button is ON");
                else
                  j.setText("Button is OFF");
            }
        });
        f.add(j);
        f.setVisible(true);
    }
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new B2();
            }
        });

        }
    }
