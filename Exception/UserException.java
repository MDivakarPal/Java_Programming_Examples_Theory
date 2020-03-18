import java.util.*;
class UserException
{
	public static void main(String []a)
	{
	    Scanner sc=new Scanner(System.in);	
		int age=sc.nextInt();
		try
		{
		if(age<18)
		{
			throw new Voter("You are not eligible indian for voter list");
		}
		else
		{
			System.out.println("You are eligible for indian Voter list");
		}
		}
		catch(Voter v)
		{
			v.printStackTrace();
			System.out.println(v.getMessage());
		}
	}
}



class Voter extends Exception
{
	Voter(String s)
	{
		super(s);
	}
}