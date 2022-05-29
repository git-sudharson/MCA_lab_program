import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class dbinsert extends Frame implements ActionListener
{
Label l1,l2;
TextField t1,t2;
Button B1,B2;
Statement S1;
public dbinsert()
{
l1=new Label("Regno");
l2=new Label("Name");
t1=new TextField(10);
t2=new TextField(10);
B1=new Button("Insert");
B2=new Button("Cancel");
add(l1);
add(l2);
add(t1);
add(t2);
add(B1);
add(B2);
setLayout(null);
l1.setBounds(50,100,100,25);
l2.setBounds(50,150,100,25);
t1.setBounds(150,100,100,25);
t2.setBounds(150,150,100,25);
B1.setBounds(150,200,75,25); 
B2.setBounds(225,200,75,25);
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
System.out.println("Enter values for insert");
Connection con=DriverManager.getConnection("Jdbc:Odbc:b1");
System.out.println(" Ready for insert ");
S1=con.createStatement();
}
catch(Exception ee)
{
System.out.println("Error"+ee);
}
B1.addActionListener(this);
B2.addActionListener(this);
}
public void actionPerformed(ActionEvent ee)
{
if(ee.getSource()==B1)
{
int ii=Integer.parseInt(t1.getText().trim());
String ss=t2.getText().trim();
try
{
S1.executeUpdate("Insert into Table1 values("+ii+",'"+ss+"')");
t1.setText("");
t2.setText("");
System.out.println(" Record Inserted");
}
catch(Exception ee1)
{
System.out.println("Record not Inserted"+ee1);
}
}
else
{
t1.setText(" ");
t2.setText(" ");
}
}
public static void main(String args[])
{
dbinsert jj=new dbinsert();
jj.setVisible(true);
jj.show();
jj.setLocation(100,100);
}
}
