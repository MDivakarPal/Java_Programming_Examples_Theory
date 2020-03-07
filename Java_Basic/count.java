import java.lang.*;
import java.util.*;
class Count{
        
public static void main(String [] ar){	
        Scanner sc=new Scanner(System.in);	
		int i,j,k;
		for(i=1;i<=10;i++)
		{
			k=i;
			for (j=1;j<=10;j++)
			{
				System.out.print(k+"\t");
				k=k+10;
			}
			System.out.println();
		}
}
}