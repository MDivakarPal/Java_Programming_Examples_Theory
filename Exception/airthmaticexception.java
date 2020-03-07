/*
Exception of this code :-
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Airthmatic_Exception.m2(airthmaticexception.java:20)
        at Airthmatic_Exception.m1(airthmaticexception.java:15)
        at Airthmatic_Exception.m(airthmaticexception.java:10)
        at Airthmatic_Exception.main(airthmaticexception.java:5)

Exception in java can be catagorised in two type :-
1. Checked Exception :- These exceptions are explicitly handled in the code itself with the help
 of try-catch blocks. Checked exceptions are extended from java.lang.Exception class.

2. Unchecked Exception :-
	These exceptions are not essentially handled in the program code instead the JVM handles such
	exceptions. Unchecked exceptions are extended from the java.lang.RunTimeException Class.

*/


class Airthmatic_Exception
{
	public static void main(String ar[])
	{
		Airthmatic_Exception.m();
		System.out.println("Main");
	}
	
	static void m()
	{
		       Airthmatic_Exception.m1();
				System.out.println("M");
	}
	 static void  m1()
	 {
		 Airthmatic_Exception.m2();
		 System.out.println("m1");
	 }
	 static void m2()
	 {
		 System.out.println(10/0); 
	 }
}