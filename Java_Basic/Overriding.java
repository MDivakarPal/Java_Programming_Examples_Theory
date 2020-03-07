/*
Overriding of method
Method overriding is concept to redefine an existed method of super class into subclass.
In overrided method signatures of method should be same in both method.
*/


class Super_1
{
	void display()
	{
		System.out.println("I am super class");
	}
}

class Sub_1 extends Super_1
{
	void display()
	{
			System.out.println("I am sub class");
	}
}
class Overriding1
{
	public static void main(String []a)
	{
		Sub_1 s=new Sub_1();
		s.display();
		Super_1 s1=new Super_1();
		s1.display();
	}
}