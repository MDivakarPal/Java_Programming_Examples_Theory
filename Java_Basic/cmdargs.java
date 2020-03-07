//Command line argument use to pass the value at time of execution
/*If We run This program As
" java Cmdargs Divakar Pal Madhu Singh Prity Tiwari Brajesh Kumar"
Then 
a[0]=Divakar
a[1]=Pal
a[2]=Madhu
a[3]=Singh
a[4]=Prity
a[5]=Tiwari
a[6]=Brajesh
a[7]=Kumar
*/
class Cmdargs
{
	public static void main(String a[])
	{
		int c,i;
		System.out.print("\t"+a[0]);
		c=a.length;
		for(i=0;i<c;i++)
		System.out.print("\t"+a[i]);
	}
}