package GUI;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PassengerException extends Exception{
    PassengerException(String s){
        super(s);
    }
}

class Airlines{
    String name;
    int ID;
    int Fno;
    String source;
    String dest;

    Airlines(){
        name="";
        ID=0;
        Fno=0;
        source="";
        dest="";

    }

    Airlines(String n,int id,int fno,String s,String d){
        name=n;
        ID=id;
        Fno=fno;
        source=s;
        dest=d;

    }
      public String toString(){
        return "Name:"+name+" ID:"+ID+" Fno:"+Fno+" Source:"+source+" Dest:"+dest;
      }
}

class Aero extends JFrame implements ActionListener{
      JTextArea a;
      JLabel l1,l2,l3,l4,l5;
      JTextField t1,t2,t3,t4,t5;
      JButton b1,b2,b3;
      ArrayList<Airlines>A;
    Aero(){
      setTitle("Airline Management");
      l1=new JLabel("Name");
      l2=new JLabel("ID");
      l3=new JLabel("Fno");
      l4=new JLabel("Source");
      l5=new JLabel("Dest");
      t1=new JTextField(10);
      t2=new JTextField(10);
      t3=new JTextField(10);
      t4=new JTextField(10);
      t5=new JTextField(10);
      b1=new JButton("Add Detail");
      b2=new JButton("Search");
      b3=new JButton("Display");
      setLayout(new FlowLayout());
      a=new JTextArea(10,30);
      JScrollPane s=new JScrollPane(a);
      add(l1); add(t1);
      add(l2); add(t2);
      add(l3);add(t3);
      add(l4);add(t4);
      add(l5);add(t5);
      add(b1);add(b2);
      add(b3);add(a);
      add(s);
      A=new ArrayList<>();
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      setSize(400,400);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    void addpass(Airlines a1){
        A.add(a1);
    }

    Airlines search(int x)throws PassengerException{
        for(Airlines a1:A){
            if(a1.ID==x){
                return a1;
            }
        }
        throw new PassengerException("Not Found");

    }

    void Display(){
        a.setText("");
        for(Airlines a1:A){
            this.a.append(a1.toString()+"\n");
        }
    }

     public void actionPerformed(ActionEvent ae){
        JButton r=(JButton)ae.getSource();
        if(r==b1){
            String n=t1.getText();
            int id=Integer.parseInt(t2.getText());
            int f=Integer.parseInt(t3.getText());
            String s=t4.getText();
            String d=t5.getText();
            Airlines AR=new Airlines(n,id,f,s,d);
            addpass(AR);
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
        
        }else if(r==b2){
            try{
                a.setText("");
                int id=Integer.parseInt(t2.getText());
                Airlines al=search(id);
                a.setText(al.toString());
            }catch(PassengerException e){
                a.setText(e.getMessage());
            }catch(Exception e){
                a.setText("Invalid Input");
            }
        }else if(r==b3){
            Display();
        }
     }

     public static void main(String[] args) {
        new Aero();
     }
}