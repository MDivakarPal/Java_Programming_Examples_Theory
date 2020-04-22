import java.util.*;
class Test
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		String nameArr[]=name.split(" ");
		name=" ";
	    for(int i=0;i<nameArr.length;i++)
		{
		name=name+nameArr[i].substring(0,1).toUpperCase()+
nameArr[i].substring(1,nameArr[i].length()).toLowerCase()+" ";
		}
		//for(String s :nameArr)
			System.out.println(name.trim());
	}
}