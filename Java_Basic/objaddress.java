// in below program output will address of easch object of Class 'a'
// Address will in format of 'a@hashcode' of memory address
// Address of each object will diffrent
import java.lang.*;
class a
{
	public static void main(String a[])
	{ 
	a a1=new a();
	a a2=new a();
	a a3=new a();
	a a4=new a();
    System.out.println(a1);
	 System.out.println(a2);
	 System.out.println(a3);
	 System.out.println(a4);
	}
}