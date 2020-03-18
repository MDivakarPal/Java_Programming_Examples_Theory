import java.util.*;
class ExceptionPlay
{
	public static void main(String []a)
	{
	    Scanner sc=new Scanner(System.in);	
		int age=sc.nextInt();
		try
		{
		if(age<18)
		{
			throw new Exception("You are not eligible indian for voter list");
		}
		else
		{
			throw new Exception("You are eligible for indian Voter list");
		}
		}
		catch(Exception v)
		{
			//v.printStackTrace();
			System.out.println(v.getMessage());
		}
	}
}