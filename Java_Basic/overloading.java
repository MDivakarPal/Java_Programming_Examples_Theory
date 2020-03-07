/*
Method overloading is a concept of same but different function.
*/




import java.util.*;
class Box{
	//ssstatic Scanner sc=new Scanner(System.in);
	void v(int x,int y,int z)
	{
		
	int v1=x+y+z;
    System.out.println(v1);	
		
	}
	int v(int x,int y)
	{
		
	int v1=x*x*x;
    	return v1;
	}
	
	
}

class Overloading
{ 	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		Box b=new Box();
		b.v(sc.nextInt(),sc.nextInt(),sc.nextInt());
	}
}