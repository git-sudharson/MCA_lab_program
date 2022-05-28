import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
/*<applet code="EventJApplet" width=200 height=200>
</applet>*/
public class EventJApplet extends JApplet implements ActionListener
{
JButton b;
JTextField tf;
public void init()
{
tf=new JTextField();
tf.setBounds(80,40,240,20);
b=new JButton("Click");
b.setBounds(170,80,70,20);
add(b);
add(tf);
b.addActionListener(this);
setLayout(null);
}
public void actionPerformed(ActionEvent e)
{
tf.setText("Welcome To JAVA Programming World");
}
}
 
