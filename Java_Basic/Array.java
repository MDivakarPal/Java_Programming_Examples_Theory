/*
Array
* Array is a collection of similar type of data element.


**Creating an Array
data type <array_name>[] =new data type [<size of Array>];
						or
data type []<array_name> =new data type [<size of Array>];

**initialization of Array
datat type <array_name> ={d1,d2,d3};
			or
data type []<array_name> =new data type []{d2,d3,d4.....dn};

* length property use to count the size of array
	ex- arr.length;

*/
import java.util.*;
class Array
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		int n; 
		System.out.println("Enter size of Array");
		n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter your Array");
		for (int i=0;i<n;i++)
		{
					System.out.println("Enter "+(i+1)+" Number");
					num[i]=sc.nextInt();
		}
		
				System.out.println("\t\t *****Your inputed array is*****");
				for(int k:num)
							System.out.print(k+"\t");
		
	}
}