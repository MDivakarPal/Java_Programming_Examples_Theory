/*
throws keyword :-
throws keyword use to handover the execption to JVM.
It is recommended to use throws keyword whenever checked execption is possible.
throws keyword use after method signature.
we can use single throws with multiple Possible Exception. 

*/


class Throws
{
	public static void main(String []a) throws InterruptedException, ClassNotFoundException
	{
		System.out.println("I am Divakar Pal");
		Thread.sleep(2000);
		System.out.println("I am Divakar Pal After sleep");
		Class.forName("Throws");
	}
	static void m()  throws InterruptedException
	{
		m1();
	}
	static void m1()  throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	
}