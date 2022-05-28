import java.io.*;
class Student
{
String name,dept;
int id;
Student(String n,int i,String d)
{ 
name=n;
id=i;
dept=d;
}
}
class Marksheet extends Student
{
int m1,m2,m3,tot;
float avg;
Marksheet(String n,int i,String d, int Mark1,int Mark2,int Mark3)
{
super(n,i,d);
m1=Mark1;
m2=Mark2;
m3=Mark3;
}
void calc()
{
tot=m1+m2+m3;
avg=tot/3;
System.out.println("\n\n\t STUDENT DETAILS");
System.out.println("\n\t ***************");
System.out.println("\n RESULT");
System.out.println("\n *****");
System.out.println("\n\tName:"+name);
System.out.println("\n\tID:"+id);
System.out.println("\n\tDepartment:"+dept); 
System.out.println("\n\tMark1:"+m1);
System.out.println("\n\tMark2:"+m2);
System.out.println("\n\tMark3:"+m3);
System.out.println("\n\tTotal:"+tot);
System.out.println("\n\tAverage:"+avg);
}
}
class Singleinheritance
{
public static void main(String args[])throws IOException
{
DataInputStream ds=new DataInputStream(System.in);
System.out.println("\n\n\t STUDENT DETAILS");
System.out.println("\n\t ****************");
System.out.print("\n\tEnter name:");
String name=ds.readLine();
System.out.print("\n\tEnter id:");
int id =Integer.parseInt(ds.readLine());
System.out.print("\n\tEnter department:");
String dept=ds.readLine();
System.out.print("\n\tEnter Mark1:");
int m1 =Integer.parseInt(ds.readLine());
System.out.print("\n\tEnter Mark2 :");
int m2 =Integer.parseInt(ds.readLine());
System.out.print("\n\tEnter Mark3 :");
int m3=Integer.parseInt(ds.readLine());
Marksheet m=new Marksheet(name,id,dept,m1,m2,m3);
m.calc();
}
}
