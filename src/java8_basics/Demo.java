package java8_basics;
//Lambda Expression for Multi Threading concept
// class MyRunnable implements Runnable
//{
//	public void run()
//	{
//		for(int i = 0; i<10; i++)
//		{
//			System.out.println("Child Thread");
//		}
//	}
//}

 class Demo {

		public static void main(String[] args) 
		{
			Runnable r = ()->{
				for(int i=0; i<10; i++) {
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

