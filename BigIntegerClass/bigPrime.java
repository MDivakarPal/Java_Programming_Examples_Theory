import java.util.*;
import java.math.*;
class BigIntegerClass
{
	public static void main(String a[])
	{
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter one big number to check is this prime");
	 String n1=sc.next();
	 BigInteger N1= new BigInteger(n1);
	 boolean res;
	 res= N1.isProbablePrime(1);
	 System.out.println(res);
	}
}