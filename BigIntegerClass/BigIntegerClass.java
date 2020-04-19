/*
BigInteger class :-
BigInteger class is use to store a very big number.

Initialization :-
BigInteger A, B;
a = 54;
b = 23;
A  = BigInteger.valueOf(54);
B  = BigInteger.valueOf(37); 
For string
A = new BigInteger("5454656136462132626")

Mathematical operations:
int c = a + b;
BigInteger C = A.add(B); 
Similarly subtract() , multiply(), divide(), remainder() are also available in BigInteger class.

Extraction of value from BigInteger:
int x   =  A.intValue();   // value should be in limit of int x
long y   = A.longValue();  // value should be in limit of long y
String z = A.toString();  
Comparison:
if (a < b) {}         // For primitive int
if (A.compareTo(B) < 0)  {} // For BigInteger 
if (A.equals(B)) {}  // A is equal to B 
*/
import java.util.*;
import java.math.*;
class BigIntegerClass
{
	public static void main(String a[])
	{
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter two big number for arithmatic operations");
	 String n1=sc.next();
	 String n2=sc.next();
	 BigInteger N1= new BigInteger(n1);
	 BigInteger N2= new BigInteger(n2);
	 System.out.println("Your first no is "+ N1.toString());
	 System.out.println("Your second no is "+ N2.toString());
	 BigInteger sum= N1.add(N2);
	 System.out.println("Your total sum is "+ sum.toString());
	 System.out.println("Your total subtraction is "+ N1.subtract(N2).toString());
	}
}