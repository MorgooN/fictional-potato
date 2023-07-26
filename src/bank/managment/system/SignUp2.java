package bank.managment.system;

import javax.swing.*;
import java.awt.*;

public class SignUp2 extends JFrame {

    String formno;
    SignUp2(String first){
        super("APPLICATION FORM");

        JComboBox comboBox, comboBox1;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png")); // to-be-commented
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2: ");
        l1.setFont(new Font("AvantGarde",Font.BOLD,20));
        l1.setBounds(300,60,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details: ");
        l2.setFont(new Font("AvantGarde",Font.BOLD,20));
        l2.setBounds(300, 30, 600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion: ");
        l3.setFont(new Font("AvantGarde",Font.BOLD,16));
        l3.setBounds(100, 120, 100,30);
        add(l3);

        JLabel l4 = new JLabel("Category: ");
        l4.setFont(new Font("AvantGarde",Font.BOLD,16));
        l4.setBounds(100, 180, 100,30);
        add(l4);

        /* add religion via comboBox is a way cooler
        JTextField textRel = new JTextField(" ");
        textRel.setFont( new Font("AvantGarde", Font.ITALIC, 14));
        textRel.setBounds(200,125,400,25);
        add(textRel);
         */

        // array of religions which will be stored in comboBox
        String[] religions = { "Catholic", "Protestant", "Orthodox", "Hindu",
        "Muslim","Sikh", "Other"};

        // another array for another comboBox
        String[] category = {"General", "OBC", "SC", "Other"};

        comboBox1 = new JComboBox(religions);
        comboBox1.setBackground(new Color(255,208,76));
        comboBox1.setFont(new Font("AvantGarde",Font.BOLD,14));
        comboBox1.setBounds(250,127,320,30);
        add(comboBox1);


        comboBox = new JComboBox(category);
        comboBox.setBackground(new Color(255,208,76));
        comboBox.setFont(new Font("AvantGarde",Font.BOLD,14));
        comboBox.setBounds(250,187,320,30);
        add(comboBox);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }
    public static void main(String[] args) {
            new SignUp2(" 23 ");
    }
}
