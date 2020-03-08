/*
Bitwise Operator :-
Java supports bitwise operator for manipulation of data at value of bit level. These operators
are use for testing the bits or shifting them to the right or left the may not apply on integer
and float. 

There are following Bitwise operators
1. & :- Bitwise AND
2. ! :- Bitwise OR
3. ^ :- Bitwise Exclusive ORB
4. ~ :- Ones Compliment
5. << :- Shift Left
6. >> :- Shift Right
7. >>> :- Shift right with zero fill


*/
import java.util.*;
class Bitwise
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		int Ist,IInd;
		System.out.println("Enter any two numbers");
		Ist=sc.nextInt();
		IInd=sc.nextInt();
		System.out.println("Result of bitwise AND is "+ (Ist & IInd));
		System.out.println("Result of bitwise OR is "+ (Ist | IInd));
		System.out.println("Result of bitwise XOR is "+ (Ist ^ IInd));
		System.out.println("Ones complement of Ist NO is "+ (~Ist));
		System.out.println("Ist no 2 bit left shift "+ (Ist<<2));
		System.out.println("Ist no 2 bit Right shift "+ (Ist>>2));
		System.out.println("Ist no 2 bit Right shift with zero fill "+ (Ist>>>2));
		
		
		
	}
}



