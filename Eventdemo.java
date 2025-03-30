import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Eventdemo implements ActionListener
{
          JFrame f;
          JButton r,g,b;
          Container con;

          Eventdemo()
          {
                    f=new JFrame("Testing");
                    f.setSize(600,300);
                    f.setLayout(null);
                    f.setVisible(true);

                    con = f.getContentPane();

                    r = new JButton("Red");
                    r.setBounds(100,200,100,30);
                    r.addActionListener(this);
                    f.add(r);

                    g = new JButton("Green");
                    g.setBounds(220,200,100,30);
                    g.addActionListener(this);
                    f.add(g);

                    b = new JButton("Blue");
                    b.setBounds(340,200,100,30);
                    b.addActionListener(this);
                    f.add(b);

          }
          public void actionPerformed(ActionEvent e)
          {
                    if(e.getSource()==r)
                    {
                              con.setBackground(Color.red);
                    }
                    if(e.getSource()==g)
                    {
                              con.setBackground(Color.green);
                    }
                    if(e.getSource()==b)
                    {
                              con.setBackground(Color.blue);
                    }

          }
          public static void main(String arg[])
          {
                    new Eventdemo();
          }

}
