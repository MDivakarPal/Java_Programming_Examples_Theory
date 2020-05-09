import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        if(stringPalindrome(c))
        System.out.println("Palindrome String");
        else
        System.out.println("Not palindrome String");
        sc.close();
        
    }
    static boolean stringPalindrome(char c[])
    {
        int l=0;
        int h=c.length-1;
        while(l<=h)
        {
            if(c[l]!=c[h])
              return false;
            l++;
            h--;
        }
        return true;
    }
}
