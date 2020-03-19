import java.util.*;
class Main
{
	static Scanner sc=new Scanner(System.in);
 	public static void main(String []a)
	{
		int age;
		System.out.println("Marrige card Distributer");
		System.out.println("Enter your Age");
		age=Integer.parseInt(sc.nextLine());
		try{
		if(age<25)
		{
			throw new MarrigeAgeException("Hey wait for "+(25-age)+" Years to marriage");
		}
		else if(age>=25 && age<=35)
		{
			System.out.println("Welcome you can marry but keep small family Best of Luck");
		}
		else if(age>35)
		{
			throw new MarrigeAgeException("Sorry You have expired for marriage");
		}
		}
		catch(MarrigeAgeException m)
		{
			System.out.println(m.getMessage());
		}
	}
}


class MarrigeAgeException extends RuntimeException{
	MarrigeAgeException(String s)
	{
		super(s);
	}
}