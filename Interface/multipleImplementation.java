/*
Using interface multiple inheritence is possible.
*/

interface I1 
{
	 public void display(int s);
}

interface I2 
{
	 void count();
}
// Multiple inheritence 
class Test implements I1, I2 
{
	public static void main(String p[])
	{
		Test t= new Test();
		t.display(7);
		t.count();
	}
	
	@Override
	
	public void display(int n)
	{
		System.out.println("No is = "+n);
	}
	
	@Override
	public void count()
	{
		System.out.println("I am count methods");
	}
}