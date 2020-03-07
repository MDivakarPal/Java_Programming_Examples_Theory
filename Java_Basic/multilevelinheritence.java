/*
Multilevel Inheritence
In a multilevel inheritence there is several super class.
In multilevel inheritence a derived class is inherited by another subclass.

*/

class Room
{
	int l,b;
	Room(int a, int b)
	{
		l=a;
		this.b=b;
	}
	int area()
	{
		return (l*b);
	}
}
class BedRoom extends Room
{ int h;
	BedRoom(int x,int y,int z)
	{
		super (x,y);
		h=z;
	}
	int volume()
	{
		return (l*b*h);
	}
}
class Kithecn extends BedRoom
{
	Kithecn()
	{
		super(4,5,6);
	}
	void display()
	{
		System.out.println("I am Kithecn");
	}
}
class Multilevel
{  
public static void main(String a[])
{
	BedRoom b=new BedRoom(14,12,10);
	System.out.println("Area of room is "+b.area());
	System.out.println("Volume of room is "+b.volume());
	Kithecn k=new Kithecn();
	k.display();
}
}