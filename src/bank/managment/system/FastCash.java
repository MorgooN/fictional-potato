package bank.managment.system;

import com.mysql.cj.log.Log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton j1,j2,j3,j4,j5,j6,j7;
    String pin;


    FastCash(String pin) {

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l1 = new JLabel("SELECT WITHDRAWAL AMOUNT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,18));
        l1.setBounds(420,180,700,40);
        l3.add(l1);

        j1 = new JButton("Rs. 100 ");
        j1.setForeground(Color.WHITE);
        j1.setBackground(new Color(65,125,128));
        j1.setBounds(402,270,150,35);
        l3.add(j1);
        j1.addActionListener(this);


        j2 = new JButton("Rs. 500");
        j2.setForeground(Color.WHITE);
        j2.setBackground(new Color(65,125,128));
        j2.setBounds(707,270,150,35);
        l3.add(j2);
        j2.addActionListener(this);

        j3 = new JButton("Rs. 1000");
        j3.setForeground(Color.WHITE);
        j3.setBackground(new Color(65,125,128));
        j3.setBounds(402,318,150,35);
        l3.add(j3);
        j3.addActionListener(this);

        j4 = new JButton("Rs. 2000");
        j4.setForeground(Color.WHITE);
        j4.setBackground(new Color(65,125,128));
        j4.setBounds(707,318,150,35);
        l3.add(j4);
        j4.addActionListener(this);

        j5 = new JButton("Rs. 5000");
        j5.setForeground(Color.WHITE);
        j5.setBackground(new Color(65,125,128));
        j5.setBounds(402,363,150,35);
        l3.add(j5);
        j5.addActionListener(this);

        j6 = new JButton("Rs. 10000");
        j6.setForeground(Color.WHITE);
        j6.setBackground(new Color(65,125,128));
        j6.setBounds(707,366,150,35);
        l3.add(j6);
        j6.addActionListener(this);

        j7 = new JButton("BACK");
        j7.setForeground(Color.WHITE);
        j7.setBackground(new Color(65,125,128));
        j7.setBounds(707,366,150,35);
        l3.add(j7);
        j7.addActionListener(this);

        setLayout(null);
        setSize(1550,830);
        setLocation(0,0);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FastCash("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == j7){
                setVisible(false);
                new Transaction(pin);
            } else{
                String amount = ((JButton)e.getSource()).getText().substring(4);
                Connector con = new Connector();
                String q = "update table";
                Date date = new Date();

                try{
                    ResultSet rs = con.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                    int balance = 0;
                    while(!rs.next()){
                        if(rs.getString("type").equals("Deposit")){
                            balance+=Integer.parseInt(rs.getString("amount"));
                        }else{
                            balance+=Integer.parseInt(rs.getString("amount"));
                        }
                    }String num =  "17";

                    if(e.getSource()!= j7 && balance < Integer.parseInt(("amount"))){
                        JOptionPane.showMessageDialog(null, "Insufficient balance");
                        return;
                    }
                    con.statement.executeUpdate("insert into bank values " +
                            "'"+pin+"','"+date+"', 'withdrawal', '"+amount+"'");
                    JOptionPane.showMessageDialog(null, "Rs+" +
                            "'"+amount+"'" + "Debited successfully");

                }catch(Exception e1){
                    e1.printStackTrace();
                }
                setVisible(false);
                new Transaction(pin);
            }
    }
}
