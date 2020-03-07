public class FinalizeMethod {  
     public static void main(String[] args)   
    {   
        FinalizeMethod obj = new FinalizeMethod();   
        System.out.println(obj.hashCode());   
       obj = null;   
        // calling garbage collector    
       System.gc();   
        //System.out.println("end of garbage collection");   
  
    }   
    @Override  
    protected void finalize()   
    {   
        System.out.println("finalize method called");   
    }   
}