/*
BigDecimal class :-
*/

import java.util.*;
import java.math.*;
class BigDecimalClass
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=Integer.parseInt(sc.nextLine());
		String []arr= new String[n];
		System.out.println("Enter your array");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextLine();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				BigDecimal N1=new BigDecimal(arr[i]);
				BigDecimal N2=new BigDecimal(arr[j]);
				if(N1.compareTo(N2)==1)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
			}
		}
		for (int i=arr.length-1;i>=0;i--)
		System.out.println(arr[i]);
	}
}