import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class completecal extends JFrame implements ActionListener
{
    float op1, op2, res;
    String sym;
    static JTextField t1;
    String [] lan={"select language","c","c==","java"};
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,f1 ,f2,f3 ,f4 ,f5, f6;
    JComboBox c1;
    public completecal()
    {
        setLayout(null);

        t1=new JTextField(10);

        b0=new JButton("0");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        f1=new JButton("+");
        f2=new JButton("-");
        f3=new JButton("*");
        f4=new JButton("/");
        f5=new JButton("=");
        f6=new JButton("Clear");

        c1=new JComboBox(lan);
        t1.setFont(new Font("Serif", Font.PLAIN, 24));
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        f1.addActionListener(this);
        f2.addActionListener(this);
        f3.addActionListener(this);
        f4.addActionListener(this);
        f5.addActionListener(this);
        f6.addActionListener(this);


        t1.setBounds(10,10,190,40);

        b1.setBounds(10,60,50,20);
        b2.setBounds(70,60,50,20);
        b3.setBounds(140,60,50,20);

        b4.setBounds(10,90,50,20);
        b5.setBounds(70,90,50,20);
        b6.setBounds(140,90,50,20);

        b7.setBounds(10,120,50,20);
        b8.setBounds(70,120,50,20);
        b9.setBounds(140,120,50,20);

        b0.setBounds(10,150,50,20);
        f1.setBounds(70,150,50,20);
        f2.setBounds(140,150,50,20);

        f3.setBounds(10,180,50,20);
        f4.setBounds(70,180,50,20);
        f5.setBounds(140,180,50,20);
        f6.setBounds(10,210,90,20);
       c1.setBounds(10,240,90,20);
        add(t1);
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(f1);
        add(f2);
        add(f3);
        add(f4);
        add(f5);
        add(f6);
        add(c1);
    }
    public void actionPerformed(ActionEvent evt) {

        if (evt.getSource() == b0) {
            t1.setText(t1.getText() + b0.getText());
        }
       else if (evt.getSource() == b1) {
            t1.setText(t1.getText() + b1.getText());
        }
       else if (evt.getSource() == b2) {
            t1.setText(t1.getText() + b2.getText());
        }
        else if (evt.getSource() == b3) {
            t1.setText(t1.getText() + b3.getText());
        }
       else if (evt.getSource() == b4) {
            t1.setText(t1.getText() + b4.getText());
        }
       else if (evt.getSource() == b5) {
            t1.setText(t1.getText() + b5.getText());
        }
        else if (evt.getSource() == b6) {
            t1.setText(t1.getText() + b6.getText());
        }
        else if (evt.getSource() == b7) {
            t1.setText(t1.getText() + b7.getText());
        }
        else if (evt.getSource() == b8) {
            t1.setText(t1.getText() + b8.getText());
        }
        else if (evt.getSource() == b9) {
            t1.setText(t1.getText() + b9.getText());
        }
        if (evt.getSource() == f6) {
            t1.setText("");
        }

      
    public static  void main(String[] args)
    {
        completecal ca=new completecal();
        ca.setSize(220,300);
        ca.setVisible(true);
    }
}

