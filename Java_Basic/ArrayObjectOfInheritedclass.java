import java.util.*;
class ArrayObjectInherited
{
	static Scanner sc=new Scanner(System.in);
	static int n;
	static public void main(String []a)
	{
	System.out.println("Enter total no of student");
	n=Integer.parseInt(sc.nextLine());
	Marks m1[]=new Marks[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter "+(i+1)+" Student details as Name, rollNO and Marks");
		m1[i]=new Marks(sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
	}
	System.out.println("Student details as Follows");
	System.out.println("Name \t Roll NO \t Marks");
	for(Marks m: m1)
	{
		System.out.println(m.name+"\t"+m.rollNO+"\t"+m.marks);
	}
    }
}

class Student
{
	String name;
	int rollNO;
	Student(String n, int r)
	{
		name=n;
		rollNO=r;
	}

}

class Marks extends Student
{
	int marks;
	Marks(String n,int r, int m)
	{
		super(n,r);
		marks=m;
	}
	void display()
	{
		System.out.println("Name ="+name);
		System.out.println("Roll No  ="+name);
		System.out.println("Marks  ="+marks);
	}	
}