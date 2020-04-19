/*
This program to get the total transmitted packets using SR
 protocol if each 'k^th' packet is lost.

*/

import java.util.*;

class Test
{
   public static void main(String ap[])
   { 
		Scanner sc=new Scanner(System.in);
		int n,l,t=0,i,k=0;
		List <Integer> list=new ArrayList<Integer>();
		System.out.println("Enter size of packet");
		n=sc.nextInt();
		System.out.println("Enter losting packet no");
		l=sc.nextInt();
		i=1;
		if(l!=1){
		while(i<=n)
		{
			list.add(k,i);
			k++;
			i++;
			t++;
			if(t==l)
			{
				t=0;
				i=i-1;
			}
		}
		System.out.println("Total Transmitted packets = "+list.size());
		System.out.println("Transmitted bits are :-");
		for(i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
		}
		else
		System.out.println("Sorry its a non terminative case");
//System.out.println("Total transmission = "+res);
   }
}