package bank.managment.system;

import com.toedter.calendar.JDateChooser; // specialized jar-file was linked to the project

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class SignUp  extends JFrame {

    JRadioButton jr1, jr2;

    JTextField textName, textFname, textGen, textEmail, textMS, textAD;
    JDateChooser dateChooser;

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

        JLabel label1 = new JLabel(" APPLICATION FORM NO. " + first); // text label with random-generated number
        label1.setBounds(160,10,600,40);
        label1.setFont(new Font("AvantGard", Font.BOLD, 30));
        add(label1);


        /* textName which function is to take text input from user. As below
         creating and adjusting  */
        textName = new JTextField();
        textName.setFont( new Font("AvantGarde", Font.ITALIC, 14));
        textName.setBounds(350,200,400,25);
        add(textName);

        textFname = new JTextField();
        textFname.setFont( new Font("AvantGarde", Font.ITALIC, 14));
        textFname.setBounds(350,300,400,25);
        add(textFname);

        textEmail = new JTextField();
        textEmail.setFont( new Font("AvantGarde", Font.ITALIC, 14));
        textEmail.setBounds(350,560,400,25);
        add(textEmail);

        textMS = new JTextField();
        textMS.setFont( new Font("AvantGarde", Font.ITALIC, 14));
        textMS.setBounds(350,610,400,25);
        add(textMS);

        textAD = new JTextField();
        textAD.setFont( new Font("AvantGarde", Font.ITALIC, 14));
        textAD.setBounds(350,660,400,25);
        add(textAD);

        /* radioButton used instead
        textGen = new JTextField();
        textGen.setFont( new Font("AvantGarde", Font.ITALIC, 14));
        textGen.setBounds(350,400,400,25);
        add(textGen); */

        // creating and adjusting(the hardest part) text labels
        JLabel label2 = new JLabel(" Page 1 ");
        label2.setFont(new Font("AvantGard", Font.BOLD, 30));
        label2.setBounds(300,80,610,40);
        add(label2);

        JLabel label3 = new JLabel(" Personal Data ");
        label3.setFont(new Font("AvantGard", Font.BOLD, 30));
        label3.setBounds(290,130,600,30);
        add(label3);

        JLabel labelName = new JLabel(" Name: ");
        labelName.setFont(new Font("AvantGard", Font.BOLD, 20));
        labelName.setBounds(100,200,100,20);
        add(labelName);

        JLabel labelFName = new JLabel("Father's Name: ");
        labelFName.setFont(new Font("AvantGard", Font.BOLD, 20));
        labelFName.setBounds(105,300,250,20);
        add(labelFName);

        JLabel DOB = new JLabel(" Date of birth: " );
        DOB.setBounds(100,350,600,40);
        DOB.setFont(new Font("AvantGard", Font.BOLD, 20));
        add(DOB);

        JLabel emailAd = new JLabel(" Email Address: ");
        emailAd .setFont(new Font("AvantGard", Font.BOLD, 20));
        emailAd .setBounds(100,550,600,40);
        add(emailAd);

        JLabel maritalStatus = new JLabel(" Marital Status: ");
        maritalStatus.setFont(new Font("AvantGard", Font.BOLD, 20));
        maritalStatus.setBounds(100,600,610,40);
        add(maritalStatus);

        JLabel address = new JLabel(" Address: " );
        address.setBounds(100,650,600,40);
        address.setFont(new Font("AvantGard", Font.BOLD, 20));
        add(address);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(350,360,400,25);
        add(dateChooser);

        JLabel labelGen = new JLabel(" Gender: ");
        labelGen.setBounds(100,450,600,40);
        labelGen.setFont(new Font("AvantGard", Font.BOLD, 20));
        add(labelGen);

        jr1 = new JRadioButton(" Male ");
        jr1.setBackground(Color.ORANGE);
        jr1.setFont(new Font("Raleway", Font.BOLD,14));
        jr1.setBounds(350,455,150,30);
        add(jr1);

        jr2 = new JRadioButton(" Female ");
        jr2.setBackground(Color.ORANGE);
        jr2.setFont(new Font("Raleway", Font.BOLD,14));
        jr2.setBounds(550,455,150,30);
        add(jr2);


        /*
        ButtonGroup class allows us to create set of connected
        buttons. If one of the button in the set in state 'ON'
        then the others automatically turning into 'OFF' state
         */
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(jr1);
        bg1.add(jr2);

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
