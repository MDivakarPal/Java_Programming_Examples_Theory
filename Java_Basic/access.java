import java.util.*;
class fact
{
	public static void main(String a[])
	{   f2 f=new f2();
	    int n,r,res;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		r=sc.nextInt();
		res=f.fact(n)/(f.fact(n-r)*f.fact(r));
		System.out.println("Combination ="+res);
	}
} 
class f2
{
	int fact1=1;
	int fact(int n)
	{ fact1=1;
		while(n>=1)
		{
			fact1=fact1*n;
			n=n-1;
		}
		System.out.println(fact1);
		return fact1;
	}
}

//ncr=n!/(n-r)!*r!