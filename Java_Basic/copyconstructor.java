/* Copy constructor use to copy the value of existing object data member value to newly created 
 object.
2. Argument of copy constructor must be object type.
3. You can pass any no of object type argument to the copy constructor. 
 */
import java.util.*;
class Copy
{  int a,b,c;
	Copy(int x,int y)
	{
		a=x;b=y;c=a+b;
		System.out.println("Sum ="+c);
	}
	Copy(Copy k)
	{
		a=k.a;b=k.b;
		c=a+b;
		System.out.println("Sum ="+c);
	}
	Copy(Copy k, Copy k1)
	{
		a=k.a;b=k1.b;
		c=a+b;
		System.out.println("Sum ="+c);
	}
	public static void main(String [] a)
	{
		Copy c=new Copy(5,8);
		Copy c3=new Copy(5,10);
		Copy c1=new Copy(c);
		Copy c2=new Copy(c1,c3);
	}
}