/*
Interface in java :- 
Interface in java is a blue print of class.
Interface only contains declaration of methods not definition.
By default all methods are public and abstract while all data fields are final, static 
and public.
A implementing class of interface must implements all methods of interface.
If a class does not implement all methods of interface then it must declared as abstract.
An interface can not instantiated.
Syntax :- 

interface <Interface_name>
{
	// Body
}

During the methods overriding we must use public access specifier with methods of interface.
*/

interface I1 
{
	 // private int a=10; not allowed modifier private not allowed only public modifier
	 // allowed
	 int a=10;
	 public void count();
	 public void display(int s);
}

// Single level Implementation
class Test implements I1 
{
	public static void main(String p[])
	{
		Test t= new Test();
		t.display(7);
		t.count();
		// I1.a=90; Not possible because 'a' is final variale

		System.out.println(I1.a); // 'a' is static and public variale
	}
	
	@Override
	
	public void display(int n)
	{
		System.out.println("No is = "+n);
	}
	public void count()
	{
		System.out.println("I am count methods");
	}
}