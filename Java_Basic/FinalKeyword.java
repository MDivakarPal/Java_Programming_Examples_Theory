/*
Final Variable and Method :-
*To prevent overriding of mthod we can declare a mthod as final method using final keyword.
*A final variable can not override any more.
*Only one copy will created for final variable without caring how many objects are created of 
class.

Final Class :-
To prevent Subclassing of a class we can declare a class as final class.
A final inherit a class but it can not inherited by any class.

Finalizer Method :-
finalize() method is protected void method of java.lang package it can override.
Finaliz() method use to frees up memory space

*/

class FinalKeyword
{
	public static void main(String []a )
	{
		FinalClass c=new FinalClass();
		//SubFinalMethod c1=new SubFinalMethod();
		c.display();
		c.display1();
		//c1.display2();
		//c1.finalize();
		c=null;
		//c1=null;
	     // calling garbage collector    
       System.gc();   
        //System.out.println("end of garbage collection");   
  
    }   
    @Override  
    protected void finalize()   
    {   
        System.out.println("finalize method called");   
    } 

}


class FinalMethod
{    
    final int a=12;
    final void display()
	{
		//a=90; not allowed Can not assign value to final bariable.
		System.out.println("I am final Method i can not not override");
	}

}

class SubFinalMethod extends FinalMethod
{
	/*void display()
	{
		System.out.println("I am final Method i can not not override");
	}  It is not allowed. "overridend method is final."*/
	void display2() // Allowed because it is method overloading
	{
		System.out.println("I am display2 ");
	} 
}

final class FinalClass extends FinalMethod
{
	void display1()
	{
		System.out.println("I am display of final class");
	}

}
 
 /*class SubFinalClass extends FinalClass
 {
	 Not allowed not inherit a final class 
 }*/