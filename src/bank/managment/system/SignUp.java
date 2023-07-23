package bank.managment.system;

import com.toedter.calendar.JDateChooser; // specialized jar-file was linked to the project

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class SignUp  extends JFrame {

    JRadioButton jr1, jr2, ms1,ms2,ms3;

    JTextField textName, textFname, textGen, textEmail, textMS, textAD, textPin;
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

        /* decided to use radioButton instead
        textMS = new JTextField();
        textMS.setFont( new Font("AvantGarde", Font.ITALIC, 14));
        textMS.setBounds(350,610,400,25);
        add(textMS); */

        textAD = new JTextField();
        textAD.setFont( new Font("AvantGarde", Font.ITALIC, 14));
        textAD.setBounds(350,660,400,25);
        add(textAD);

        textPin = new JTextField();
        textPin.setFont( new Font("AvantGarde", Font.ITALIC, 14));
        textPin.setBounds(350,710,400,25);
        add(textPin);

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

        JLabel PinCode = new JLabel(" PinCode ");
        PinCode.setFont(new Font("AvantGard", Font.BOLD, 20));
        PinCode.setBounds(100,700,610,40);
        add(PinCode);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(350,360,400,25);
        add(dateChooser);

        JLabel labelGen = new JLabel(" Gender: ");
        labelGen.setBounds(100,450,600,40);
        labelGen.setFont(new Font("AvantGard", Font.BOLD, 20));
        add(labelGen);


        // using radioButton for genderChoosing
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

        // same radioButtons but for a marital status choose
        ms1 = new JRadioButton(" Married ");
        ms1.setBackground(Color.ORANGE);
        ms1.setFont(new Font("Raleway", Font.BOLD,14));
        ms1.setBounds(350,600,150,30);
        add(ms1);

        ms2 = new JRadioButton(" Unmarried ");
        ms2.setBackground(Color.ORANGE);
        ms2.setFont(new Font("Raleway", Font.BOLD,14));
        ms2.setBounds(550,600,150,30);
        add(ms2);

        ms3 = new JRadioButton(" Other ");
        ms3.setBackground(Color.ORANGE);
        ms3.setFont(new Font("Raleway", Font.BOLD,14));
        ms3.setBounds(730,600,150,30);
        add(ms3);




        /*
        ButtonGroup class allows us to create set of connected
        buttons. If one of the button in the set in state 'ON'
        then the others automatically turning into 'OFF' state
         */
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(jr1);
        bg1.add(jr2);

        // same purpose as for above code, but now for the
        // marital status
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(ms1);
        bg2.add(ms2);
        bg2.add(ms3);

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
