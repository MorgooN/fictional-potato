package bank.managment.system;

import javax.swing.*;
import java.awt.*;

public class Deposit extends JFrame {

    String pin;
    Deposit(String pin){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        this.pin = pin;
        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);


    }

    public static void main(String[] args) {
            new Deposit(" ");
    }
}
