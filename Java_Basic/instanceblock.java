/* 1. Instance block is a block which has not return type , no name and no argument
2. Instance block is defined inside the '{  }'.
3. Instance block runs before the constructor and at the time of object creation.
Need of Instance block :
Instance blocks can use to contain a code which is necessary to run at the of object creation
*/
class Instance
{
      Instance()
	  {
		  System.out.println("I am Constructor with no argument");
	  }
      // Instance block
	  {
		  System.out.println("I am first instance blocks");
	  }
	  
	  Instance(int x)
	  {
		  System.out.println("I am Constructor with one argument"+x);
	  }
	  
	  {
		  System.out.println("I am Second instance blocks");
	  }	
public static void main(String [] ar)
{
	Instance i=new Instance();
	Instance i1=new Instance(44);
}	  
}