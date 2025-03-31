import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class click implements ActionListener
{
          JFrame f;
          JButton r,g,b;
          Container c;

          click()
          {
                    f=new JFrame("Bsc=it");
                    f.setSize(600,300);
                    f.setLayout(null);
                    f.setVisible(true);


                    c= f.getContentPane();

                    r= new JButton("Red");
                    r.setBounds(120,70,100,50);
                    r.addActionListener(this);
                    f.add(r);

                    g= new JButton("Green");
                    g.setBounds(220,70,100,50);
                    g.addActionListener(this);
                    f.add(g);

                    
                    b= new JButton("Blue");
                    b.setBounds(320,70,100,50);
                    b.addActionListener(this);
                    f.add(b);
          }
          public void actionPerformed(ActionEvent e)
          {
                    if(e.getSource()==r)
                    {
                              c.setBackground(Color.red);
                    }

                    if(e.getSource()==g)
                    {
                              c.setBackground(Color.green);
                    }
                    
                    if(e.getSource()==b)
                    {
                              c.setBackground(Color.blue);
                    }
 
          }
          public static void main(String arg[])
          {
                    new click();
          }

}