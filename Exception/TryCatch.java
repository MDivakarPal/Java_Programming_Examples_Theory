/*  
Try Catch Block :-
Try block is a block of risky code which may produce a checked exception and terminate the 
 execution of program abnormaly.
 Try block should be followed by a catch block which catchs exception throwed by try block.
 Post execution of try block code after exception occuring will be terminated.
 
**Catch block will excute only at time of exception in try block.

*/


import java.io.*;
import java.util.*;
class Try_Catch
{
	public static void main(String a[]) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		int m=0;
		try
		{
			n=sc.nextInt();
			Test t=new Test();
			Class.forName("Hk");
			Class.forName("Hk");
			System.out.println((n/m));
			FileReader fr=new FileReader("Trt.java");
			System.out.println("I am Divakar Pal");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Divide by zero");
		}
		catch (FileNotFoundException g)
		{
			System.out.println("File NOt found exception");

		}
		
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found exception");
		
		}
			
		}
}

class Test
{
	void display()
	{
		System.out.println("Test");
	}
}