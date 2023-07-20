package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// for display login components we'll be use
// JFrame which is a container for a labels buttons etc.
public class Login extends JFrame implements ActionListener {

    JLabel label1, label2 , label3;
    JTextField textField1, textField2;
    JPasswordField passwordField;
    JButton button1, button2, button3;

    Login(){
        super(" Bank management system ");

       // placing "bank" image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png")); // to-be-commented
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);


        // placing "card" image
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png")); // to-be-commented
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(730,450,100,100);
        add(iimage);


        // placing label before setting the background image
        // because the mentioned image will cover our label
        label1 = new JLabel(" WELCOME to ATM ");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde",Font.BOLD, 38));
        label1.setBounds(230,125,450,40); // Label position
        add(label1);


        // Labels for car number and pin. Pretty straightforward
        label2 = new JLabel("Card number: ");
        label2.setFont(new Font("AvantGarde",Font.ITALIC,29));
        label2.setForeground(Color.BLACK);
        label2.setBounds(150,190,375,30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(335,190,230,30);
        textField2.setFont(new Font("AvantGarde",Font.BOLD,14));
        add(textField2);


        passwordField = new JPasswordField(15);
        passwordField.setBounds(335,250,230,30);
        passwordField.setFont(new Font("AvantGarde",Font.BOLD,14));
        add(passwordField);

        // TO BE COMMENTED
        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("AvantGarde",Font.BOLD,20));
        button1.setForeground(Color.GRAY);
        button1.setBounds(300,300,110,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("AvantGarde",Font.BOLD,20));
        button2.setForeground(Color.GRAY);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("AvantGarde",Font.BOLD,20));
        button3.setForeground(Color.GRAY);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        add(button3);

        label3 = new JLabel("PIN: ");
        label3.setFont(new Font("AvantGarde",Font.ITALIC,29));
        label3.setForeground(Color.BLACK);
        label3.setBounds(150,250,375,30);
        add(label3);




        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png")); // to-be-commented
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);

        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

            // to commented
            try{
            if(e.getSource()==button1){

            }else if(e.getSource() == button2){
                textField2.setText(" ");
                passwordField.setText(" ");

            } else if(e.getSource()==button3){

            }

            }catch(Exception E){
                    E.printStackTrace();
            }
    }

    public static void main(String[] args) {
        new Login();
    }


}
