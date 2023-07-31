package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {

    TextField amtText;
    JButton j1, j2;
    String pin;
    Withdrawl(String pin){
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
        JLabel l1 = new JLabel("MAX WITHDRAWAL IS 10,000");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,18));
        l1.setBounds(460,180,400,35);
        l3.add(l1);

        JLabel l2 = new JLabel("ENTER YOUR AMOUNT");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,18));
        l2.setBounds(460,220,400,35);
        l3.add(l2);

        amtText = new TextField();
        amtText.setBackground(new Color(65,125,128));
        amtText.setForeground(Color.WHITE);
        amtText.setFont(new Font("AvantGarde", Font.ITALIC, 22));
        amtText.setBounds(460,260,320,25);
        l3.add(amtText);



        j2 = new JButton("BACK");
        j2.setBounds(700,372,150,35);
        j2.setBackground(new Color(65,125,128));
        j2.setForeground(Color. WHITE);
        j2.addActionListener(this);
        l3.add(j2);

        j1 = new JButton("WITHDRAW");
        j1.setBounds(700,332,150,35);
        j1.setBackground(new Color(65,125,128));
        j1.setForeground(Color.WHITE);
        j1.addActionListener(this);
        l3.add(j1);



        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    public static void main(String[] args) {
            new Withdrawl("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==j1) {
            try {
                String amount = amtText.getText();
                Date date = new Date();

                if (amtText.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter correct amount");
                } else {
                    Connector con = new Connector();
                    ResultSet rs = con.statement.executeQuery("select * from bank where pin = " +
                            "'" + pin + "'");
                    int balance = 0;
                    while (rs.next()) {
                        if (rs.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(rs.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(rs.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "");
                        return;
                    }
                    con.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "' 'Withdrawal', " +
                            "'" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited" +
                            "Successfully");
                    setVisible(false);
                    new Transaction(pin);
                }

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }else if(e.getSource() == j2){
            setVisible(false);
            new Transaction(pin);
        }
    }
}
