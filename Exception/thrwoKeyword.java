/*
throw Keyword:-
1. throw keyword use to create own or customize exception.
2. throw keyword throws object of throwable class. Throwable class means a class which inhrites 
   Throwable class direct or indirect.
3. printStackTrace() method is defined in Throwable class and displays trace of exception object 
	with error message.
4.  getMessage() method is also method of Throwable class which returns error message as string.
if we want to create a checked exception then we should extend our exception class by Exception class.
*/





class ThrowKeyword
{
	public static void main(String [] a)
	{
		
			try
			{
			 CheckThrow.add1(45,7);
			throw new CheckThrow("Divakar pal");
			}
			catch(CheckThrow c)
			{
				c.printStackTrace();
			}
		
			Uncheked u=new Uncheked("I am Runtime Exception");
			u.add(78,45);
			throw u;
			// For Uncheked exception try and catch block is not required.
		
		
	}
}
// Example of unchecked exception.
class Uncheked extends RuntimeException
{
	Uncheked(String s)
	{
		super(s);
	}
	void add(int a ,int b)
	{
		System.out.println("Sum = "+(a+b));
	}
}



// Example of checked exception
class CheckThrow extends Exception
{ 
	CheckThrow(String s)
	{
		super(s);
	}
	static void add1(int a ,int b)
	{
		System.out.println("Sum = "+(a+b));
	}
}