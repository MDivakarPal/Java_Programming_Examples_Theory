class Variable
{

	//Variable v=new Variable(); //It occurs exception StackOverflowError
		int v=90; // Allowed
		Static s=new Static();
		Static s1=new Static();
		public static void main(String []a)
		{
			Variable v=new Variable();
			System.out.println(v.v);
		}
	
}

class Static
{
	{
		System.out.println("I am instance block");
		
	}
		static 
	{
		Static s2=new Static();
		System.out.println("I am static member");
	}
}