import java.util.*;
abstract class Shape
{
abstract void area();
}
class Square extends Shape
{
float a;
Square(float b)
{
a=b;
}
void area()
{
System.out.println("\n\t AREA OF A SQUARE="+(a*a));
}
}
class Rectangle extends Shape
{
float l,b;
Rectangle(float x,float y)
{
l=x;
b=y;
}
void area()
{
System.out.println("\n\t AREA OF A RECTANGLE="+(l*b));
}
}
class Abstract1
{
public static void main(String args[])
{
Scanner ds=new Scanner(System.in);
System.out.print("\n\t ABSTRACT CLASS FOR SHAPES");
System.out.print("\n\t ************************* ");
System.out.print("\n\n\t Enter a:");
float a=ds.nextFloat();
Square s=new Square(a);
s.area();



System.out.print("\n\t Enter l:");
float l=ds.nextFloat();
System.out.print("\n\t Enter b:");
float b=ds.nextFloat();
Rectangle r=new Rectangle(l,b);
r.area();
}
}

