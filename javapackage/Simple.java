package mypack;
import java.util.*;  
public class Simple{  
   public static Scanner sc=new Scanner(System.in);
    /*public static void main(String args[]){  
    System.out.println("Welcome to package Enter your name");
    String str=sc.nextLine();
    System.out.println(str);  
   }  */

   public static String inputName()
   {
       System.out.println("Enter your name");
       String str=sc.nextLine();
       return str;
   }

  public static int [] inputArray()
   {
       System.out.println("Enter size of array");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter your array");
       for(int i=0;i<n;i++)
       arr[i]=sc.nextInt();
       return arr;
   }

   public static void printArray(int arr[])
   {
       System.out.println("Your inpitd array is ");
       for(int i=0;i<arr.length;i++)
       System.out.print(arr[i]+" , ");
    }
 
    public static void printMsg(String s)
    {
        System.out.println(s);
    }

}  