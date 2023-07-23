package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SignUp  extends JFrame {

    JTextField textName, textFname;

    /* The goal of the 3 below lines is to
    generate random value for an application form */
    Random r1 = new Random();
    long first4 = (r1.nextLong()%9000L) + 1000L;
    String first = " " + Math.abs(first4);

    SignUp(){
        super(" APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png")); // to-be-commented
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel(" APPLICATION FORM NO. " + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("AvantGard", Font.BOLD, 30));
        add(label1);


        /* textName which function is to take text input from user. As below
         creating and adjusting  */
        textName = new JTextField();
        textName.setFont( new Font("AvantGarde", Font.ITALIC, 14));
        textName.setBounds(350,200,300,35);
        add(textName);

        textFname = new JTextField();
        textFname.setFont( new Font("AvantGarde", Font.ITALIC, 14));
        textFname.setBounds(350,300,300,35);
        add(textFname);


        // creating and adjusting(the hardest part) text labels
        JLabel label2 = new JLabel(" Page 1 ");
        label2.setFont(new Font("AvantGard", Font.BOLD, 30));
        label2.setBounds(300,80,610,40);
        add(label2);

        JLabel label3 = new JLabel(" Personal Data ");
        label3.setFont(new Font("AvantGard", Font.BOLD, 30));
        label3.setBounds(290,130,600,30);
        add(label3);

        JLabel labelName = new JLabel(" Name ");
        labelName.setFont(new Font("AvantGard", Font.BOLD, 30));
        labelName.setBounds(100,200,100,30);
        add(labelName);

        JLabel labelFName = new JLabel("Father's Name ");
        labelFName.setFont(new Font("AvantGard", Font.BOLD, 30));
        labelFName.setBounds(100,300,250,30);
        add(labelFName);





        getContentPane().setBackground(Color.ORANGE);
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignUp();

    }
}
