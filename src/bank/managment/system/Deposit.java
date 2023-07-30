package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    String pin;
    TextField amtText;
    JButton j1, j2;
    Deposit(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        /* since we're adding label ON the black part
        of the image (l3) it would be reasonable to add white foreground
         */
        JLabel l1 = new JLabel("ENTER AMOUNT DEPOSIT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,18));
        l1.setBounds(460,180,400,35);
        l3.add(l1);

        amtText = new TextField();
        amtText.setBackground(new Color(65,125,128));
        amtText.setForeground(Color.WHITE);
        amtText.setFont(new Font("AvantGarde", Font.ITALIC, 22));
        amtText.setBounds(460,230,320,25);
        l3.add(amtText);

        j1 = new JButton("DEPOSIT");
        j1.setBounds(700,406,150,35);
        j1.setBackground(new Color(65,125,128));
        j1.setForeground(Color.WHITE);
        j1.addActionListener(this);
        l3.add(j1);

        j2 = new JButton("BACK");
        j2.setBounds(700,362,150,35);
        j2.setBackground(new Color(65,125,128));
        j2.setForeground(Color. WHITE);
        j2.addActionListener(this);
        l3.add(j2);


        this.pin = pin;
        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    public static void main(String[] args) {
            new Deposit(" ");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String amt = amtText.getText();
            Date date = new Date();
            // classic connection establishing.
            if(e.getSource()==j1){
                if(amtText.getText().equals("")){
                         JOptionPane.showMessageDialog(null,
                                 "please enter amount you want to deposit");
                }else{
                    Connector con = new Connector();
                    String q = "insert into bank values('" +pin+"', '"+date+"', 'Deposit'," +
                            "'"+amt+"')";
                    con.statement.executeUpdate(q);
                    JOptionPane.showMessageDialog(null,"Rs. " + amt +
                            " Deposited successful");
                    setVisible(false);
                }
            } else if (e.getSource() == j2) {
                 setVisible(false);
            }
        } catch(Exception E){
            E.printStackTrace();
        }



    }
}
