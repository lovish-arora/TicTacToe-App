import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class home_page extends JFrame implements ActionListener
{
    JLabel lblimg=new JLabel(new ImageIcon("c:/users/imlov/javaprog/pic.jpg"));
    JLabel l0 = new JLabel("");
    JLabel l1 = new JLabel("Player1: ");
    JLabel l2 = new JLabel("Player 2: ");
    JTextField tx1 = new JTextField(50);
    JTextField tx2 = new JTextField(50);
    JButton b1 = new JButton("Start Game");
    JButton b2 = new JButton("Exit");

    public home_page()
    {
        setVisible(true);
        setSize(600,600);
        setTitle("title");
        setLayout(null);


        l1.setBounds(100,100,100,50);
        l2.setBounds(100,170,100,50);
        tx1.setBounds(250,100,150,50);
        tx2.setBounds(250,170,150,50);
        b1.setBounds(100,270,100,50);
        b2.setBounds(250,270,100,50);
        lblimg.setBounds(0,0,600,600);
        

        add(l1);
        add(l2);
        add(tx1);
        add(tx2);
        add(b1);
        add(b2);
        add(lblimg);


        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b1)
        {    
            tic obj2 = new tic(tx1.getText(),tx2.getText());
        }

        if (e.getSource() == b2)
        {
            JOptionPane.showMessageDialog(null,"game closed");
            this.dispose();
        }
    }

    public static void main(String args[])
    {
        home_page obj1 = new home_page();
    }
}
