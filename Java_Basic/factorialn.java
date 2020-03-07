import java.util.*;
class Factorialn
{    
	static void fact(int x)
	{
		int facto=1;
		while(x>=1)
		{
			facto=facto*x;
			x--;
		}
		System.out.println(facto);
	}
    public static void main(String [] a1)
	{
	Scanner sc=new Scanner(System.in);
	int n,i;
	System.out.println("Enter no of element");
	n=sc.nextInt();
	int a[]=new int[n];
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
	{
		fact(a[i]);
	}
}
}