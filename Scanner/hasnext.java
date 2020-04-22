import java.util.*;  
class ScannerHasNextExample1 {    
    public static void main(String args[]){       
          //Create Scanner object  
        Scanner scan = new Scanner(System.in);  
        //Printing the delimiter used  
        //System.out.println("Delimiter:" + scan.delimiter());  
        //Print the Strings 
           boolean res=true;		
        while (res) {  
            System.out.println(scan.next());
            res=scan.hasNext();			
        }  
        //Close the scanner  
        scan.close();  
        }    
}  