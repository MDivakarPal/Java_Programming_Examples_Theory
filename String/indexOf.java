class StringExp
{
	public static void main(String a[])
	{
		String s="Divakar Pal is a good boy";
		System.out.println(s.indexOf("Pal"));
		if(s.indexOf("Pall")<0)
		{
			System.out.println("NOt exist");
		}
	}
}