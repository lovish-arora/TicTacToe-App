import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class tic extends JFrame implements ActionListener
{
    int WFLG = 0,flag = 0,ctr = 0;

    TextField tx = new TextField(50);
    JLabel l0 = new JLabel("");
    JLabel l1 = new JLabel("");
    JLabel l2 = new JLabel("");
    JLabel l3 = new JLabel("");
    JLabel l4 = new JLabel("");
    JLabel l5 = new JLabel("");
    JLabel l6 = new JLabel("");
    JLabel l7 = new JLabel("");
    JLabel l8 = new JLabel("");
    JLabel ltitle = new JLabel("        TIC-TAC-TOE");
    JLabel turn = new JLabel("");

    JButton b0 = new JButton("");
    JButton b1 = new JButton("");
    JButton b2 = new JButton("");
    JButton b3 = new JButton("");
    JButton b4 = new JButton("");
    JButton b5 = new JButton("");
    JButton b6 = new JButton("");
    JButton b7 = new JButton("");
    JButton b8 = new JButton("");
    

    String player1,player2;

    public tic(String p1 , String p2)
    {

        player1 = p1;
        player2 = p2;

        setVisible(true);
        setSize(600,600);
        setTitle("TicTacToe");
        setLayout(null);
        setBackground(new Color(120,120,120));

        l0.setBounds(100,100,100,100);
        l1.setBounds(220,100,100,100);
        l2.setBounds(340,100,100,100);
        l3.setBounds(100,220,100,100);
        l4.setBounds(220,220,100,100);
        l5.setBounds(340,220,100,100);
        l6.setBounds(100,340,100,100);
        l7.setBounds(220,340,100,100);
        l8.setBounds(340,340,100,100);
        ltitle.setBounds(120,20,300,60);
        turn.setBounds(120,460,400,100);

        b0.setBounds(100,100,100,100);
        b1.setBounds(220,100,100,100);
        b2.setBounds(340,100,100,100);
        b3.setBounds(100,220,100,100);
        b4.setBounds(220,220,100,100);
        b5.setBounds(340,220,100,100);
        b6.setBounds(100,340,100,100);
        b7.setBounds(220,340,100,100);
        b8.setBounds(340,340,100,100);

        l0.setBackground(new Color (0,0,0));
        l1.setBackground(new Color (0,0,0));
        l2.setBackground(new Color (0,0,0));
        l3.setBackground(new Color (0,0,0));
        l4.setBackground(new Color (0,0,0));
        l5.setBackground(new Color (0,0,0));
        l6.setBackground(new Color (0,0,0));
        l7.setBackground(new Color (0,0,0));
        l8.setBackground(new Color (0,0,0));
        
        l0.setFont(new Font ("Arial" , Font.BOLD,30));
        l1.setFont(new Font ("Arial" , Font.BOLD,30));
        l2.setFont(new Font ("Arial" , Font.BOLD,30));
        l3.setFont(new Font ("Arial" , Font.BOLD,30));
        l4.setFont(new Font ("Arial" , Font.BOLD,30));
        l5.setFont(new Font ("Arial" , Font.BOLD,30));
        l6.setFont(new Font ("Arial" , Font.BOLD,30));
        l7.setFont(new Font ("Arial" , Font.BOLD,30));
        l8.setFont(new Font ("Arial" , Font.BOLD,30));
        ltitle.setFont(new Font ("Algerian" , Font.BOLD , 30));
        turn.setFont(new Font("Algerian",Font.BOLD , 30));

        l0.setForeground(new Color (0,0,0));
        l1.setForeground(new Color (0,0,0));
        l2.setForeground(new Color (0,0,0));
        l3.setForeground(new Color (0,0,0));
        l4.setForeground(new Color (0,0,0));
        l5.setForeground(new Color (0,0,0));
        l6.setForeground(new Color (0,0,0));
        l7.setForeground(new Color (0,0,0));
        l8.setForeground(new Color (0,0,0));
        ltitle.setForeground(new Color ( 120,120,120));

        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(l0);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(ltitle);
        add(turn);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);

        turn.setText(player1+"'s Turn ");
    }

    public void actionPerformed(ActionEvent e)
    {

        if(flag == 0)
        {
            turn.setText(player2+"'s' Turn");
        }
        if (flag == 1)
        {
            turn.setText(player1+"'s' Turn");
        }

        if(l1.getText() == "    X " || l1.getText() == "    O ")
        {
            b2.setVisible(false);
            l2.setText("done");
        }

        if(e.getSource() == b0)
        {
            ctr++;
            
            if(flag == 0)
            {
                b0.setVisible(false);
                l0.setText("     X ");
                flag = 1;
            }
            else
            {
                b0.setVisible(false);
                l0.setText("     O ");
                flag = 0;
            }
            
        }

        if(e.getSource() == b1)
        {
            ctr++;

            if(flag == 0)
            {
                b1.setVisible(false);
                l1.setText("     X ");
                flag = 1;
            }
            else
            {
                b1.setVisible(false);
                l1.setText("     O ");
                flag = 0;
            }
        }

        if(e.getSource() == b2)
        {
            ctr++;

            if(flag == 0)
            {
                b2.setVisible(false);
                l2.setText("     X ");
                flag = 1;
            }
            else
            {
                b2.setVisible(false);
                l2.setText("     O ");
                flag = 0;
            }
        }

        if(e.getSource() == b3)
        {
            ctr++;

            if(flag == 0)
            {
                b3.setVisible(false);
                l3.setText("     X ");
                flag = 1;
            }
            else
            {
                b3.setVisible(false);
                l3.setText("     O ");
                flag = 0;
            }
        }

        if(e.getSource() == b4)
        {
            ctr++;

            if(flag == 0)
            {
                b4.setVisible(false);
                l4.setText("     X ");
                flag = 1;
            }
            else
            {
                b4.setVisible(false);
                l4.setText("     O ");
                flag = 0;
            }
        }

        if(e.getSource() == b5)
        {
            ctr++;

            if(flag == 0)
            {
                b5.setVisible(false);
                l5.setText("     X ");
                flag = 1;
            }
            else
            {
                b5.setVisible(false);
                l5.setText("     O ");
                flag = 0;
            }
        }

        if(e.getSource() == b6)
        {
            ctr++;

            if(flag == 0)
            {
                b6.setVisible(false);
                l6.setText("     X ");
                flag = 1;
            }
            else
            {
                b6.setVisible(false);
                l6.setText("     O ");
                flag = 0;
            }
        }

        if(e.getSource() == b7)
        {
            ctr++;

            if(flag == 0)
            {
                b7.setVisible(false);
                l7.setText("     X ");
                flag = 1;
            }
            else
            {
                b7.setVisible(false);
                l7.setText("     O ");
                flag = 0;
            }
        }

        if(e.getSource() == b8)
        {
            ctr++;
            
            if(flag == 0)
            {
                b8.setVisible(false);
                l8.setText("     X ");
                flag = 1;
            }
            else
            {
                b8.setVisible(false);
                l8.setText("     O ");
                flag = 0;
            }
        }

        

        if (l0.getText().equals(l1.getText()) && l1.getText().equals(l2.getText()) && l2.getText() != "")
        {
           // lwin.setText(l0.getText() + "win");
           WFLG=1;
        }
        if (l3.getText().equals(l4.getText()) && l4.getText().equals(l5.getText()) && l5.getText() != "")
        {
            WFLG=1;
        }
        if (l6.getText().equals(l7.getText()) && l7.getText().equals(l8.getText()) && l8.getText() != "" ) 
        {
            WFLG=1;
        }
        if (l0.getText().equals(l3.getText()) && l3.getText().equals(l6.getText()) &&l6.getText() != "")
        {
            WFLG=1;
        }
        if (l1.getText().equals(l4.getText()) && l4.getText().equals(l7.getText()) &&l7.getText() != "")
        {
            WFLG=1;
        }
        if (l2.getText().equals(l5.getText()) && l5.getText().equals(l8.getText()) &&l8.getText() != "")
        {
            WFLG=1;
        }
        if (l0.getText().equals(l4.getText()) && l4.getText().equals(l8.getText()) &&l8.getText() != "")
        {
            WFLG=1;
        }
        if (l2.getText().equals(l4.getText()) && l4.getText().equals(l6.getText()) &&l6.getText() != "")
        {
            WFLG=1;
        }        
        if(WFLG==1)
        {
            if(flag == 0)
            {
                JOptionPane.showMessageDialog(null,player2+ " Wins);
                this.dispose();
            }
            if(flag == 1)
            {
                JOptionPane.showMessageDialog(null,player1+ " Wins");
                this.dispose();
            }
        }
        if(ctr == 9 && WFLG==0)
        {
            JOptionPane.showMessageDialog(null,"Draw");
            this.dispose();
        }
    }
}
