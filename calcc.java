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
   
    public static  void main(String[] args)
    {
        completecal ca=new completecal();
        ca.setSize(220,300);
        ca.setVisible(true);
    }
}

