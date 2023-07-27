package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp3 extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4;
    ButtonGroup br1;
    JCheckBox b1,b2,b3,b4,b5,b6,b7;
    String formno;

    JButton j1, j2;
    SignUp3(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png")); // to-be-commented
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);


        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,850);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);

        JLabel l1 = new JLabel("Page 3");
        l1.setFont(new Font("AvantGarde", Font.BOLD, 22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("AvantGarde", Font.BOLD, 22));
        l2.setBounds(280,70,200,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type");
        l3.setFont(new Font("AvantGarde", Font.BOLD, 16));
        l3.setBounds(180,130,400,40);
        add(l3);

        JLabel l4 = new JLabel("Card Number: ");
        l4.setFont(new Font("AvantGarde", Font.BOLD, 16));
        l4.setBounds(180,250,200,40);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit card number)");
        l5.setFont(new Font("AvantGarde", Font.BOLD, 13));
        l5.setBounds(180,280,250,20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("AvantGarde", Font.BOLD, 16));
        l6.setBounds(450,260,250,20);
        add(l6);

        JLabel l7 = new JLabel("PIN: ");
        l7.setFont(new Font("AvantGarde", Font.BOLD, 16));
        l7.setBounds(180,330,250,20);
        add(l7);

        JLabel l8 = new JLabel("XXXX");
        l8.setFont(new Font("AvantGarde", Font.BOLD, 16));
        l8.setBounds(450,330,250,20);
        add(l8);

        JLabel l9 = new JLabel("(4-digit password)");
        l9.setFont(new Font("AvantGarde", Font.BOLD, 13));
        l9.setBounds(180,350,250,20); // ideal placement
        add(l9);

        JLabel l10 = new JLabel("Services required: ");
        l10.setFont(new Font("AvantGarde", Font.BOLD, 16));
        l10.setBounds(180,400,250,20); // ideal placement
        add(l10);

        JLabel l11 = new JLabel("Form No: " + formno);
        l11.setFont(new Font("AvantGarde", Font.BOLD, 13));
        l11.setBounds(700,10,250,20); // ideal placement
        add(l11);

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

        br1 = new ButtonGroup();
        br1.add(r1);
        br1.add(r2);
        br1.add(r3);
        br1.add(r4);


        b1 = new JCheckBox("ATM CARD");
        b1.setBackground(new Color(215,252,252));
        b1.setFont(new Font("AvantGarde",Font.BOLD,16));
        b1.setBounds(340,395,200,20);
        add(b1);

        b2 = new JCheckBox("Internet Banking");
        b2.setBackground(new Color(215,252,252));
        b2.setFont(new Font("AvantGarde",Font.BOLD,16));
        b2.setBounds(540,395,200,20);
        add(b2);

        b3 = new JCheckBox("Mobile Banking");
        b3.setBackground(new Color(215,252,252));
        b3.setFont(new Font("AvantGarde",Font.BOLD,16));
        b3.setBounds(340,440,200,20);
        add(b3);

        b4 = new JCheckBox("Email Alert");
        b4.setBackground(new Color(215,252,252));
        b4.setFont(new Font("AvantGarde",Font.BOLD,16));
        b4.setBounds(540,440,200,20);
        add(b4);

        b5 = new JCheckBox("Mobile Alert");
        b5.setBackground(new Color(215,252,252));
        b5.setFont(new Font("AvantGarde",Font.BOLD,16));
        b5.setBounds(340,490,150,20);
        add(b5);

        b6 = new JCheckBox("Account check");
        b6.setBackground(new Color(215,252,252));
        b6.setFont(new Font("AvantGarde",Font.BOLD,16));
        b6.setBounds(540,490,200,20);
        add(b6);

        b7 = new JCheckBox("I declare that the above entered details are correct.");
        b7.setBackground(new Color(215,252,252));
        b7.setFont(new Font("AvantGarde",Font.BOLD,11));
        b7.setBounds(100,580,600,20);
        add(b7);

        j1 = new JButton("Submit");
        j1.setFont(new Font("AvantGarde", Font.BOLD,16));
        j1.setBackground(Color.BLACK);
        j1.setForeground(Color.white);
        j1.setBounds(420,720,100,30);
        j1.addActionListener(this);
        add(j1);

        j2 = new JButton("Cancel");
        j2.setFont(new Font("AvantGarde", Font.BOLD,16));
        j2.setBackground(Color.BLACK);
        j2.setForeground(Color.white);
        j2.setBounds(220,720,100,30);
        j2.addActionListener(this);
        add(j2);


    }

    public static void main(String[] args) {
        new SignUp3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accType = "";
        String serReq = "";

        if(e.getSource()==r1){
            accType = "savingAccount";
        }else if(e.getSource()==r2){
            accType = "FixDepAcc";
        }else if(e.getSource()==r3){
            accType = "CurrentAcc";
        } else if (e.getSource()==r4) {
            accType = "RecDepAcc";
        }

        Random r1 = new Random();
        long first7 = (r1.nextLong() % 9000000L) + 143896569456L;
        String cardNumb = " " + Math.abs(first7);
        long first4 = (r1.nextLong() % 9000L) + 1000L;
        String pinNumb = " " + Math.abs(first4);

        String servReq = "";
        if(e.getSource()==b1){
            servReq += serReq + "ATM CARD";
        } else if (e.getSource()==b2) {
            servReq +=servReq + "InternetBanking";
        } else if (e.getSource()==b3) {
            servReq += serReq +  "MobBank";
        } else if (e.getSource() == b4) {
            servReq  += serReq + "EmailAlert";
        } else if (e.getSource()==b5) {
            servReq+= serReq + "MobAlert";
        }else if(e.getSource()==b6){
            servReq +=serReq + "AccCheck";
        }
        try{

            Connector con = new Connector();
            String q = "insert into accDet values('" +accType+"', '"+cardNumb+"', '"+pinNumb+"', " +
                    "'"+serReq+"','"+formno+"')";
            con.statement.executeUpdate(q);
            String q1 = "insert into login values('"+cardNumb+"', '"+pinNumb+"','"+formno+"')";
            con.statement.executeUpdate(q1);
            JOptionPane.showMessageDialog(null," Card Number " + cardNumb +
                    " \nPIN " + pinNumb);

            if(e.getSource()==j2){
                System.exit(0);
            }



        }catch(Exception e2){
            e2.printStackTrace();
        }
    }
}
