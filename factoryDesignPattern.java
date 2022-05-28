import java.io.*;

abstract class ebbill
{
	protected double rate;
	abstract void getrate();
	public void calculateBill(int units)
	{
	  System.out.println(units*rate);
	}
}
class domestic extends ebbill
{ 	
	public void getrate()
	{
	  rate=3.50;
	}
}
class institutional extends ebbill
{
	public void getrate()
	{
	 rate=5.50;
	}
}
class commercial extends ebbill
{
	public void getrate()
	{
	  rate=7.50;
	}
}

class getPlanFactory
{
	public ebbill getplan(String plantype)
	{
	 if(plantype==null)
	{
	  return null;
	}		
	if(plantype.equalsIgnoreCase("domestic"))
	{
	  return new domestic();
	}
	else if(plantype.equalsIgnoreCase("institutional"))
	{
	  return new institutional();
	}
	else if(plantype.equalsIgnoreCase("commercial"))
	{
	  return new commercial();
	}
	  return null;
	}
}
class factoryDesignPattern
{
	public static void main(String args[])throws IOException
	{
	getPlanFactory p=new getPlanFactory();
	DataInputStream ds=new DataInputStream(System.in);
	System.out.println("factory bill generator ");
	System.out.print("Enter the planName: ");
	String planname=ds.readLine();
	System.out.print("Enter the units: ");
	int units=Integer.parseInt(ds.readLine());

	ebbill pl=p.getplan(planname);
	System.out.println("Bill amount for "+planname+"is ");
	pl.getrate();
	pl.calculateBill(units);
	}
}