/*
Abstract Keyword :-

*Abstract keyword use to define a abstract method and class abstract method and class is opposite of 
final method and final class.
* A abstract class must be inherited by atleast one one class
* An abstract method must be override in its subclass.
* Object of an abstract class is not possible directly.
* An abstract method cannot have body.
*/

// Example of an abstract class
abstract class MainClass
{
   	  abstract void display();
	  /*abstract void display()
	  {
		 NOt allowed 
	  }*/
}

class SubClass extends MainClass
{
	void display()
	{
		System.out.println("I am overriden Abstract method");
	}
}

class Abstract
{  
// MainClass mb= new MainClass();  not allowed  "Cannot Instantiated a abstract class".
    public static void main(String []a)
	{
	SubClass s=new SubClass();
	s.display();
	}
}