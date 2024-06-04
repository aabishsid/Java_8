package java8_basics;
//Implementing thread concept by using anonymous inner class
public class Example6 {

	public static void main(String[] args) 
	{
//		Runnable r = new Runnable() //creating an object for its implementation class
//		{
//			public void run()
//			{
//				for(int i=0; i<10; i++)
//				{
//					System.out.println("Child Thread");
//				}
//			}
//		};	
		Runnable r=()->{
			for(int i=0; i<10; i++)
			{
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Thread");
		}
	}
}
