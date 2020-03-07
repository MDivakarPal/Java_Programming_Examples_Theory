
import java.util.*;
class AccessMode
{
	private int a,b,c;
	protected void setData(int x,int y)
	{
		a=x;b=y;
	}
	protected int areaRect()
	{
		c=a*b;
		return c;
	}
}
class AcessMOdeMain
{  public static void main(String [] a11){
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter sides of rectangle");
	AccessMode a=new AccessMode();
	a.setData(sc.nextInt(),sc.nextInt());
	System.out.println("Area of rectangle is =\t"+a.areaRect());
   }
}