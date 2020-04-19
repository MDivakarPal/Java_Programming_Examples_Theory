import java.util.*;
import java.math.*;

class BigDecimalClass
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		BigDecimal N1=new BigDecimal(".12");
		BigDecimal N2=new BigDecimal("0.12");
		System.out.println(N1.compareTo(N2));
	}
}