import java.io.*;
interface Prototype
{
public Prototype getClone();
}
class StudentRecord implements Prototype
{
String name,dept;
int id,m1,m2,m3,tot;
float avg;
StudentRecord()
{
System.out.println("Name\tID\tDepart\tM1\tM2\tM3\tTotal\tAverage");
}
StudentRecord(String name,int id,String dept,int m1,int m2,int m3)
{
this();
this.name=name;
this.id=id;
this.dept=dept;
this.m1=m1;
this.m2=m2;
this.m3=m3;
}
void showRecord()
{
tot=m1+m2+m3;
avg=tot/3;
System.out.println(name+"\t"+id+"\t"+dept+"\t"+m1+"\t"+m2+"\t"+m3+"\t"+tot+"\t"+avg);
}
public Prototype getClone()
{
return new StudentRecord(name,id,dept,m1,m2,m3);
}
}
class Prototypedpt
{
public static void main(String args[])throws IOException
{
DataInputStream ds=new DataInputStream(System.in);
System.out.print("\n\t\t Student Details Using Prototype Design Pattern");
System.out.print("\n\t\t **********************************************");
System.out.print("\nEnter the name:");
String name=ds.readLine();
System.out.print("Enter id:");
int id=Integer.parseInt(ds.readLine());
System.out.print("Enter Department:");
String dept=ds.readLine();
System.out.print("Enter Mark1:");
int m1=Integer.parseInt(ds.readLine());
System.out.print("Enter Mark2:");
int m2=Integer.parseInt(ds.readLine());
System.out.print("Enter Mark3:");
int m3=Integer.parseInt(ds.readLine());
StudentRecord S=new StudentRecord(name,id,dept,m1,m2,m3);
StudentRecord s1=(StudentRecord)S.getClone();
S.showRecord();
}
}
