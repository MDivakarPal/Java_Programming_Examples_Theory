// Constructor is a special type of member method
// Name of Constructor should be same as name of Class name
// Constructor can not call by developer or programmer.
// Constructor atumatically invoked at time of object creation
// Constructor  may be or may not be parameterized
class Constructor
{
	// Default Constructor
	Constructor()
	{
		System.out.println("I am Default Constructor");
	}
	// Parameterized Constructor
	Constructor(int x)
	{
		System.out.println("I am parameterized constructor"+(x*x));
	}
}

class Constructor1
{
	public static void main(String [] a)
	{
		Constructor c1= new Constructor();
		Constructor c2= new Constructor(6);
		//c1.Constructor(7); it line gives error Symbol Constructor(int) not found
	}
}