/*
1. In JDK8 we can define implementation of a method inside the interface 
2. In JDK8 we can make a method as static which will not inherit and not refrenced
*/

interface Interface
{
	public static final int a=10;
	static void display()
	{
		System.out.println("I am Interface");
	}
	void count();
}

class Test implements Interface
{
	public static void main(String a[])
	{ 
		Test t= new Test();
		Interface.display();
		t.count();
		//t.display();
	}	
   @Override
	/*public void display()
	{
		System.out.println("I am Overriding"); 
		// NOt allowed
	}*/
	public void count()
	{
		System.out.println("I am not static method");
	}
}