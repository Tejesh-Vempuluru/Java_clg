package GUI;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PassengerNotFoundException extends Exception {
    public PassengerNotFoundException(String message) {
        super(message);
    }
}

class Airlines {
    String pass_name;
    int pass_id;
    int Flight_no;
    String Source;
    String Destination;

    Airlines() {
        pass_name = "";
        pass_id = 0;
        Flight_no = 0;
        Source = "";
        Destination = "";
    }

    Airlines(String n, int id, int f, String S, String D) {
        pass_name = n;
        pass_id = id;
        Flight_no = f;
        Source = S;
        Destination = D;
    }

    public String toString() {
        return "Passenger name: " + pass_name + ", Passenger id: " + pass_id +
                ", Flight no: " + Flight_no + ", Source: " + Source + ", Destination: " + Destination;
    }
}

class AirlinesManagement extends JFrame implements ActionListener {
    JTextArea a;
    JButton b1, b2, b3;
    JTextField t1, t2, t3, t4, t5;
    JLabel l1, l2, l3, l4, l5;
    ArrayList<Airlines> a1;

    AirlinesManagement() {
        setTitle("Airlines Management");

        l1 = new JLabel("Enter the Passenger name:");
        l2 = new JLabel("Enter the Passenger ID:");
        l3 = new JLabel("Enter the Flight number:");
        l4 = new JLabel("Enter the Source:");
        l5 = new JLabel("Enter the Destination:");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);
        t5 = new JTextField(10);

        b1 = new JButton("Add Passenger");
        b2 = new JButton("Search Passenger");
        b3 = new JButton("Display Passengers");

        setLayout(new FlowLayout());

        a = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(a);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add(t4);
        add(l5); add(t5);
        add(b1); add(b2); add(b3);
        add(scrollPane);

        a1 = new ArrayList<>();

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void addpassenger(Airlines a) {
        a1.add(a);
    }

    Airlines searchpassenger(int x) throws PassengerNotFoundException {
        for (Airlines a : a1) {
            if (a.pass_id == x) {
                return a;
            }
        }
        throw new PassengerNotFoundException("Passenger not found");
    }

    void displayPassenger() {
        a.setText(""); // Clear previous text
        for (Airlines a : a1) {
            this.a.append(a.toString() + "\n");
        }
    }

    public void actionPerformed(ActionEvent ae) {
        JButton r = (JButton) ae.getSource();
        if (r == b1) {
            String n = t1.getText();
            int id = Integer.parseInt(t2.getText());
            int f = Integer.parseInt(t3.getText());
            String S = t4.getText();
            String D = t5.getText();
            Airlines A = new Airlines(n, id, f, S, D);
            addpassenger(A);
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
        } else if (r == b2) {
            try {
                int id = Integer.parseInt(t2.getText());
                Airlines al = searchpassenger(id);
                a.setText(al.toString());
            } catch (PassengerNotFoundException e) {
                a.setText(e.getMessage());
            } catch (Exception e) {
                a.setText("Invalid input");
            }
        } else if (r == b3) {
            displayPassenger();
        }
    }

    public static void main(String args[]) {
        new AirlinesManagement();
    }
}

