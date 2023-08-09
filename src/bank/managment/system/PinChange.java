package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {

    JButton j1,j2;
    JTextField t1,t2;

    String pin;

    PinChange(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l1 = new JLabel("CHANGE YOUR PIN");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,18));
        l1.setBounds(430,180,700,40);
        l3.add(l1);

        JLabel l2 = new JLabel("Enter new pin: ");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,18));
        l2.setBounds(430,230,700,40);
        l3.add(l2);

        t1 = new JTextField();
        t1.setBounds(600,235,100,30);
        t1.setFont(new Font("AvantGarde",Font.BOLD,14));
        l3.add(t1);










        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PinChange();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
