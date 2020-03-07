//We can overload main also
/*To overload main you should ensure that every main contains different no of argumentes or 
Different no of argument.*/

class MainOver
{
	public static void main()
	{
		System.out.println("I am zero argumented Main");
	}
	int main(int x)
	{
		return x;
	}
	int main(int x,int y)
	{
		int z=0;
		z=x+y;
		return z;
	}
	public static void main(String ar[])
	{
		MainOver n=new MainOver();
		main();
		System.out.println(n.main(6));
		System.out.println(n.main(6,89));
		
	}
}