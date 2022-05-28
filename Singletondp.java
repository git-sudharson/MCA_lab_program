import java.io.*;
import java.lang.*;
class Singleton1
{
private static Singleton1 single_instance=null;
public String s;
private Singleton1(String s)
{
this.s=s;
}
public static Singleton1 getInstance(String s)
{
if(single_instance==null)
single_instance=new Singleton1(s);
return single_instance;
}
}
class Singletondp
{
public static void main(String args[])throws IOException
{
DataInputStream ds=new DataInputStream(System.in);
System.out.println("\n\t\t Singleton Design Pattern");
System.out.println("\n\t\t ************************");
System.out.print("\n Enter String1:");
String s1=ds.readLine();
Singleton1 x=Singleton1.getInstance(s1);
x.s=(x.s).toUpperCase();
System.out.println("\nString from x is:"+x.s);
x.s=(x.s).toLowerCase();
System.out.println("String from x is:"+x.s);
}
}
