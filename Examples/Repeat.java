/*
This is a program to count the maximum repeative number.
Explaination:- This program will print the maximum repeative n

*/


import java.util.*;
class Repeat
{
	public static void main(String []a)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter size of array");
		n=Integer.parseInt(sc.nextLine());
		int arr[],i,j,repeat[];
		arr=new int[n];
		repeat=new int[n];
		System.out.println("Enter your array");
		for(i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		
		// Code to count the repeation of number
		for(i=0;i<n;i++)
		{ 
			for(j=i;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					repeat[i]=repeat[i]+1;
				}
			}
			
		}
		System.out.println("Maximum repeated no is "+arr[max(repeat)]);
		
	}
	
	static int max(int arr[])
	{
		int  m,mi,i;
			m=arr[0];
			mi=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>=m)
			{
				m=arr[i];
				mi=i;
			}
		}
		return mi;
	}
}