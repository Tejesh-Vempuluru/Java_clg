package GUI;
import javax.swing.*;

public class Color {
    JMenu m,sm;
    JMenuItem i1,i2,i3,i4,i5;
    Color(){
      JFrame f=new JFrame("Menu and menu item ");
      JMenuBar mb=new JMenuBar();
      m=new JMenu("Menu");
      sm=new JMenu("Sub menu");
     i1=new JMenuItem("item 1");
     i2=new JMenuItem("item 2");
     i3=new JMenuItem("item 3");
     i4=new JMenuItem("item 4");
     i5=new JMenuItem("item 5");
     m.add(i1);
     m.add(i2);
     m.add(i3);
     sm.add(i4);
     sm.add(i5);
     m.add(sm);
     mb.add(m);
     f.setJMenuBar(mb);
     f.setSize(400,400);
     f.setLayout(null);
     f.setVisible(true);    
    }
    public static void main(String args[]){
        new Color();
    }
    
}
