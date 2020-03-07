/*
Hierarchical Inheritence
In a hierarchical inheritence a super class is inherited by more than on subclass.
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
class Kitchen extends Room
{
	Kitchen()
	{
		super(5,7);
	}
	void display()
	{
		System.out.println("I am Hierarchical Inharitence");
	}
}
class Hierarchical
{  
public static void main(String a[])
{
	Kitchen	b=new Kitchen();
	System.out.println("Area of room is "+b.area());
	b.display();
}
}