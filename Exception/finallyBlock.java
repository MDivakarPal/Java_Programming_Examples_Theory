/*
finally :-
code of finally block executes in all condition.

catch block does not reqire to execute finally block.

catch block can not place after finally block.


*/


class FinallyBlock
{
	public static void main(String []a)
	{
	try
	{
		System.out.println("I am Try");
		System.out.println(10/0);
	}	
	catch(ArithmeticException e)
	{
       e.printStackTrace();
	}
	finally
	{
		System.out.println("I am finally block");
	}
	}
}