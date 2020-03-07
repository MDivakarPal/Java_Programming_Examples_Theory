/*Nesting method is calling of method inside a method is known as nesting of method.
we can call a static member inside non static member method.
*/
class Nesting
{
	static int a,b;
	Nesting(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	static int largest()
	{//Nesting n=new Nesting(48,56);
		if(a>b)
			return a;
		else
			return b;
	}
	void Display()
	{
			System.out.println("Larsgest no among "+a+" And "+b+" is"+largest());
	}
	public static void main(String []a)
	{
		Nesting n=new Nesting(78,89);
		n.Display();
	}
}