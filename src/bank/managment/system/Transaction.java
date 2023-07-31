package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaction extends JFrame implements ActionListener {

    JButton j1,j2,j3,j4,j5,j6;

    Transaction() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l1 = new JLabel("SELECT TRANSACTION");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,18));
        l1.setBounds(420,180,700,40);
        l3.add(l1);

        j1 = new JButton("DEPOSIT;");
        j1.setForeground(Color.WHITE);
        j1.setBackground(new Color(65,125,128));
        j1.setBounds(402,270,150,35);
        l3.add(j1);
        j1.addActionListener(this);

        setLayout(null);
        setSize(1550,830);
        setLocation(0,0);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Transaction();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
