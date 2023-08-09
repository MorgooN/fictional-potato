package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {

    JButton j1,j2;
    JTextField t1,t2;
    String pin;

    PinChange(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l1 = new JLabel("CHANGE YOUR PIN");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,18));
        l1.setBounds(430,180,700,40);
        l3.add(l1);

        JLabel l2 = new JLabel("Enter new pin: ");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,18));
        l2.setBounds(430,230,700,40);
        l3.add(l2);

        t1 = new JTextField();
        t1.setBounds(600,235,100,30);
        t1.setFont(new Font("AvantGarde",Font.BOLD,14));
        l3.add(t1);

        JLabel l4 = new JLabel("Re-enter new PIN: ");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("System",Font.BOLD,18));
        l4.setBounds(430,290,700,40);
        l3.add(l4);

        t2 = new JTextField();
        t2.setBounds(600,290,100,30);
        t2.setFont(new Font("AvantGarde",Font.BOLD,14));
        l3.add(t2);

        j1 = new JButton("CHANGE");
        j1.setForeground(Color.WHITE);
        j1.setBackground(new Color(65,125,128));
        j1.setBounds(702,370,150,35);
        l3.add(j1);
        j1.addActionListener(this);

        j2 = new JButton("BACK");
        j2.setForeground(Color.WHITE);
        j2.setBackground(new Color(65,125,128));
        j2.setBounds(702,412,150,35);
        l3.add(j2);
        j2.addActionListener(this);


        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PinChange(" ");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==j2){
                setVisible(false);
                new Transaction(pin);
            }

            try{
                String p1 = t1.getText();
                String p2 = t2.getText();

                //  Entered pins must be the same
                if(!p1.equals(p2)){
                    JOptionPane.showMessageDialog(null,"Both pins must" +
                            " be identical");
                    return;
                }
                if(e.getSource()==j1){
                    if(p1.equals(" ")){
                        JOptionPane.showMessageDialog(null,"PIN is not entered");
                        return;
                    }
                    if(p2.equals("")){
                        JOptionPane.showMessageDialog(null,"2'nd PIN is not entered");
                        return;
                    }

                    // since we have 3 tables that containing PIN we must update them all
                    Connector con = new Connector();
                    String q1 = "update bank set pin = '"+pin+"' where pin = '"+pin+"'";
                    String q2 = "update login set pin = '"+pin+"' where pin = '"+pin+"'";
                    String q3 = "update bank set pin = '"+pin+"' where pin = '"+pin+"'";

                    // updating all tables containing pins in bankSystem dataBase;
                    con.statement.executeUpdate(q1);
                    con.statement.executeUpdate(q2);
                    con.statement.executeUpdate(q3);

                    JOptionPane.showMessageDialog(null,"Pin updated successfully");
                    setVisible(false);
                    new Transaction(pin);
                }

            }catch(Exception E){
                E.printStackTrace();
            }
    }
}
