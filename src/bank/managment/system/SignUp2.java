package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp2 extends JFrame implements ActionListener {

    JComboBox comboBox, comboBox1, comboBox2,comboBox3, comboBox4;
    JRadioButton r1,r2,e1,e2;
    ButtonGroup bt1, bt2;
    JButton next;
    String formno;

    SignUp2(String first){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png")); // to-be-commented
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2: ");
        l1.setFont(new Font("AvantGarde",Font.BOLD,20));
        l1.setBounds(300,60,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details: ");
        l2.setFont(new Font("AvantGarde",Font.BOLD,20));
        l2.setBounds(300, 30, 600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion: ");
        l3.setFont(new Font("AvantGarde",Font.BOLD,16));
        l3.setBounds(100, 120, 100,30);
        add(l3);

        JLabel l4 = new JLabel("Category: ");
        l4.setFont(new Font("AvantGarde",Font.BOLD,16));
        l4.setBounds(100, 180, 100,30);
        add(l4);

        JLabel l5 = new JLabel("Income: ");
        l5.setFont(new Font("AvantGarde",Font.BOLD,16));
        l5.setBounds(100, 247, 100,30);
        add(l5);

        JLabel l6 = new JLabel("Education: ");
        l6.setFont(new Font("AvantGarde",Font.BOLD,16));
        l6.setBounds(100, 307, 100,30);
        add(l6);

        JLabel l7 = new JLabel("Occupation: ");
        l7.setFont(new Font("AvantGarde",Font.BOLD,16));
        l7.setBounds(100, 367, 100,30);
        add(l7);

        JLabel l8 = new JLabel("Senior Citizen: ");
        l8.setFont(new Font("AvantGarde",Font.BOLD,16));
        l8.setBounds(100, 407, 130,30);
        add(l8);

        JLabel l9 = new JLabel("Existing acc. : ");
        l9.setFont(new Font("AvantGarde",Font.BOLD,16));
        l9.setBounds(100, 467, 130,30);
        add(l9);

        JLabel l10 = new JLabel(formno);
        l10.setFont(new Font("AvantGarde",Font.BOLD,16));
        l10.setBounds(750, 10, 130,30);
        add(l10);

        JLabel l11 = new JLabel("Form No: " +first);
        l11.setFont(new Font("AvantGarde",Font.BOLD,16));
        l11.setBounds(700, 10, 130,30);
        add(l11);

        // to be commented
        r1 = new JRadioButton("YES");
        r1.setFont(new Font("AvantGarde",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(250,409,100,30);
        add(r1);

        r2= new JRadioButton("NO");
        r2.setFont(new Font("AvantGarde",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(450,409,100,30);
        add(r2);

        e1 = new JRadioButton("YES");
        e1.setFont(new Font("AvantGarde",Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(250,469,100,30);
        add(e1);

        e2 = new JRadioButton("NO");
        e2.setFont(new Font("AvantGarde",Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(450,469,100,30);
        add(e2);

        bt1 = new ButtonGroup();
        bt1.add(r1);
        bt1.add(r2);

        bt2 = new ButtonGroup();
        bt2.add(e1);
        bt2.add(e2);

        /* add religion via comboBox is a way cooler
        JTextField textRel = new JTextField(" ");
        textRel.setFont( new Font("AvantGarde", Font.ITALIC, 14));
        textRel.setBounds(200,125,400,25);
        add(textRel);
         */

        // array of religions which will be stored in comboBox
        String[] religions = { "Catholic", "Protestant", "Orthodox", "Hindu",
        "Muslim","Sikh", "Other"};

        // another array for another comboBox
        String[] category = {"General", "OBC", "SC", "Other"};
        String[] income = {" Null", "<150000","<250000","<500000", "Above 500000"};
        String[] edu = {"Non-Graduate","Middle","College","Bachelor","Master","Ph.D"};
        String[] occup = {"Self-Employed", "Salaried", "Business", "Student","Retired", "Other"};

        String rel;
        String inc;
        String cat;
        String educ;
        String oc;


        //comboBox which holds religions
        comboBox1 = new JComboBox(religions);
        comboBox1.setBackground(new Color(255,208,76));
        comboBox1.setFont(new Font("AvantGarde",Font.BOLD,14));
        comboBox1.setBounds(250,127,320,30);
        add(comboBox1);

        //comboBox which holds category
        comboBox = new JComboBox(category);
        comboBox.setBackground(new Color(255,208,76));
        comboBox.setFont(new Font("AvantGarde",Font.BOLD,14));
        comboBox.setBounds(250,187,320,30);
        add(comboBox);

        //comboBox for income
        comboBox2 = new JComboBox(income);
        comboBox2.setBackground(new Color(255,208,76));
        comboBox2.setFont(new Font("AvantGarde",Font.BOLD,14));
        comboBox2.setBounds(250,247,320,30);
        add(comboBox2);

        comboBox3 = new JComboBox(edu);
        comboBox3.setBackground(new Color(255,208,76));
        comboBox3.setFont(new Font("AvantGarde",Font.BOLD,14));
        comboBox3.setBounds(250,307,320,30);
        add(comboBox3);

        comboBox4 = new JComboBox(occup);
        comboBox4.setBackground(new Color(255,208,76));
        comboBox4.setFont(new Font("AvantGarde",Font.BOLD,14));
        comboBox4.setBounds(250,367,320,30);
        add(comboBox4);

        next = new JButton("Next");
        next.setFont(new Font("AvantGarde", Font.BOLD,18));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }
    public static void main(String[] args) {
            new SignUp2(" 23 ");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            String cat = (String) comboBox.getSelectedItem(); // processing users choose via getSelectedItem method
            String rel = (String) comboBox1.getSelectedItem();
            String inc = (String) comboBox2.getSelectedItem();
            String edu = (String) comboBox3.getSelectedItem();
            String occ = (String) comboBox4.getSelectedItem();

            String senCit = " ";
            if(e.getSource()==r1){
                senCit = "YES";
            }else if(e.getSource() == r2){
                senCit = "NO";
            }

            String exAc = " ";
            if(e1.isSelected()){
                exAc  = "YES";
            }else if(e.getSource()==e2){
                exAc = "NO";
            }
    }
}
