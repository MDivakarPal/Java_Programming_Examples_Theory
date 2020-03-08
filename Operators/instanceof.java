/*
instanceof :-
instanceof is a key word in java it returns boolean data.
use to check wheather a object is instance of a class or not.
it returns true if given object is instance of given class.
*/


class Instance 
{
	public static void main(String a[])
	{
		Instance instance=new Instance();
		boolean t1=instance instanceof Instance; 
		if(t1)
		{
			System.out.println("Yes i am a Instance ");
		}
	}
}