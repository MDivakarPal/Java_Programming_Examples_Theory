class ClassNot
{
	public static void main(String []a)
	{
		try
		{
			Class.forName("Hello");
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Hello class is not found"); 
		}
		
		
	}
}