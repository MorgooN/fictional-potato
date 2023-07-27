package bank.managment.system;

import javax.swing.*;
import java.awt.*;

public class SignUp3 extends JFrame {

    JRadioButton r1, r2, r3, r4;
    ButtonGroup br1;
    SignUp3(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png")); // to-be-commented
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);


        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,500);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);

        JLabel l1 = new JLabel("Page 3");
        l1.setFont(new Font("AvantGarde", Font.BOLD, 22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("AvantGarde", Font.BOLD, 22));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type");
        l3.setFont(new Font("AvantGarde", Font.BOLD, 16));
        l3.setBounds(180,130,400,40);
        add(l3);

        r1 = new JRadioButton("Saving account ");
        r1.setFont(new Font("Avant Garde", Font.BOLD,15));
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(170,167,150,30);
        add(r1);

        r2 = new JRadioButton("Fixed deposit account ");
        r2.setFont(new Font("Avant Garde", Font.BOLD,15));
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(320,167,230,30);
        add(r2);

        r3 = new JRadioButton("Current account ");
        r3.setFont(new Font("Avant Garde", Font.BOLD,15));
        r3.setBackground(new Color(215,252,252));
        r3.setBounds(550,167,200,30);
        add(r3);

        r4 = new JRadioButton("Recurrent deposit account ");
        r4.setFont(new Font("Avant Garde", Font.BOLD,15));
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(170,197,250,30);
        add(r4);



    }

    public static void main(String[] args) {
        new SignUp3();
    }
}
