/*
NullPointerException :-
NullPointerException ariese whenver we try to access a non 
static variable using non instantiated variable.
*/


class User{
	static User u;
	int a;
	public static void main(String []a)
	{
		System.out.println(u.a);
	}
	/*
	This code will produce following RuntimeException.:
	
	Exception in thread "main" java.lang.NullPointerException
        at User.main(NullPointerException1.java:13) 		
		*/
}