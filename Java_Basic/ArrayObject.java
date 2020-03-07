/*
Conversion in to int
Integer.parseInt(var);
Note :- Use nextLine() method to take input from user.
*/




import java.util.*;
class College
{
		String name;
		int clgCode;
		int stuNo;
		int totalBranch;
		College(String n,int cg,int s,int t)
		{
			name=n;
			stuNo=s;
			totalBranch=t;
			clgCode=cg;
		}
}

class ArrayObject
{
	public static void main(String a[])
	{
		Scanner sc =new Scanner(System.in);
				System.out.println("Enter total no of College");
				String name;
		int tclg=Integer.parseInt(sc.nextLine());
		College clg []=new College[tclg];
		for(int i=0;i<tclg;i++)
		{
			System.out.println("Enter "+(i+1)+"college Details in form of \n name Collge Code total student total Branch");
			name = sc.nextLine();
			int cg=Integer.parseInt(sc.nextLine());
			int s=Integer.parseInt(sc.nextLine());
			int t=Integer.parseInt(sc.nextLine());
			clg [i]=new College(name,cg,s,t);
		}
		System.out.println("College Name\t,\tCollege Code\t,\tTotal Student \t,\tTotal Branch\t,\t");
		for(College k: clg)
		{
		System.out.println(k.name+"\t,\t"+k.clgCode+"\t,\t"+k.stuNo+"\t,\t"+k.totalBranch);
		}
	}
}