package java8_basics;

//import java8_basics.DefaultEx.DefaultMethod;

public class DefaultMethod implements DefaultEx
{
	public void m1()
	{
		System.out.println("overriding version of default method");
	} 
// If the implementation class is not satisfied with default implementation then impl class is allowed to override tht 
//   default method  
	
	
	public static void main(String[] args) 
	{
		DefaultMethod dm = new DefaultMethod();
		dm.m1();
		
	}


}
