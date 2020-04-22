import java.util.Scanner;

class Test {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest=s.substring(0,k);
        largest=s.substring(0,k);
        for(int j=1;j<=(s.length()-k);j++)
        {
                    if(smallest.compareTo(s.substring(j,j+k))>0)
                         smallest=s.substring(j,j+k);
                    if(largest.compareTo(s.substring(j,j+k))<0)
                         largest=s.substring(j,j+k);
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
        String s = scan.next();
		System.out.println("Enter your sub string length ");
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}