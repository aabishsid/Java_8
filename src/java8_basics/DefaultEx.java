package java8_basics;

interface DefaultEx 
{
	default void m1()
	{
		System.out.println("Default Method");
	}
	
	
//public class DefaultMethod implements DefaultEx
//{
//	public void m1()
//	{
//		System.out.println("overriding version of default method");
//	}
//	
//	
//		public static void main(String[] args) 
//		{
//			DefaultMethod dm = new DefaultMethod();
//			dm.m1();
//			
//		}
//	}

}
