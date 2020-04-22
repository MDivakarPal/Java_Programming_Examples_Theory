import java.util.*;
 class Test
 {
	 static int search(char c)
	 {
		 char []arr={'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		 int i=0;
		 if(c=='0')
		    return 2;
			else{
		 while(i<arr.length)
		 {
			 if(arr[i]==c)
					break;
			 else
				 i++;
		 }
		 return i+2;
		}
	 }
	 public static void main(String a[])
	 {
		 Scanner sc= new Scanner (System.in);
		 String a1[]= sc.nextLine().split(" ");
         int res1[]=new int [a1.length];
		  int base=0,res=0;
		  for(int i=0;i<a1.length;i++)
		  { res=0;
	        base=0;
			  for(int j=0;j<a1[i].length();j++)
			  {
				if(base<search(a1[i].charAt(j)))
					base=search(a1[i].charAt(j));
			  }
			  
			  for(int j=0;j<a1[i].length()-1;j++)
			  {
				  if(a1[i].charAt(j)=='0')
					  res=res;
				  else
				  res=res+base*(search(a1[i].charAt(j))-1);
			  }
			  //int n=a1[i].length
			   	if(a1[i].charAt(a1[i].length()-1)=='0')
					  res=res;
			   else
				  res=res+(search(a1[i].charAt(a1[i].length()-1))-1);
			  res1[i]=res;
		  }
		  //Arrays.sort(res1);
		  for(int k: res1)
			  System.out.println(k);
	 }
 }