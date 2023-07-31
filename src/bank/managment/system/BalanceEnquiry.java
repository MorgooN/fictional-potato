package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JButton j1;
    String pin;
    JLabel l2;
    BalanceEnquiry(String pin){

        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l1 = new JLabel("Current balance is: ");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,18));
        l1.setBounds(420,180,700,40);
        l3.add(l1);


        j1 = new JButton("BACK");
        j1.setBounds(700,362,150,35);
        j1.setBackground(new Color(65,125,128));
        j1.setForeground(Color. WHITE);
        j1.addActionListener(this);
        l3.add(j1);

        l2 = new JLabel();
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,18));
        l2.setBounds(430,220,700,40);
        l3.add(l2);


        int balance = 0;

        l2.setText(" "+balance);

        try{
            Connector con = new Connector();
            ResultSet rs = con.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while(rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else{
                    balance -=Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch(Exception e1){
            e1.printStackTrace();
        }

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }
    public static void main(String[] args) {
        new BalanceEnquiry("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Transaction(pin);
    }
}
