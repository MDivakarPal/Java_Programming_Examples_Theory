/*
Object of super class can hold objcet of sub class.
Object of super class and sub class is convirsionable into each other.
*/

class ArrayDisimalar
{
	 static Super1 s[]=new Super1[4];
	 public static void main(String []a)
	 {
		 s[0]=new Super1(105);
		 s[1]=new Super1(14);
		 s[2]=new Super1(897);
		 s[3]=new Sub1(74);
		 for(Super1 s1 :s)
		 {   
	         if(s1 instanceof Sub1)
			 {
			   Sub1 m=(Sub1)s1; // Type casting of Super1 into sub1
			   System.out.println(m.g);
			 }
			 System.out.println(s1.a);
		 }
	 }
	 
}

class Super1
{
	int a;
	Super1(int a)
	{
		this.a=a;
	}
}

class Sub1 extends Super1
{ int g;
    Sub1(int a)
	{
		super(9);
		g=a;
	}
}