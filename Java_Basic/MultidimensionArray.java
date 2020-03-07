/*
Multi Dimension Array :
Java supports array of array. In java we can create multi dimensional array in two ways 
1st is same as C programming.
and second way is we can create multi dimensional array using concept of array of array in array of 
array we can create sub array with different size in term of single parent array. 
*/
import java.util.*;
class Md
{
	public static void main(String []a)
	{ Scanner sc=new Scanner(System.in);
		int arr[][]= new int[5][];
		for(int i=0;i<5;i++)
		{
			System.out.println("Roll No 90"+(i+1)+" Enter your total no backlogs");
			arr[i]=new int[Integer.parseInt(sc.nextLine())];
			System.out.println("Roll No 90"+(i+1)+" Enter your total no backlogs Details subject wise");
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=Integer.parseInt(sc.nextLine());
			}
		}
		
			System.out.println("Backlog Details");
			for (int k[]: arr)
			{
				for(int l: k)
				{	
			        System.out.println("\t"+l);
				}
			}
		
	}
}