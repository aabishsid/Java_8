package java8_basics;

public interface Example3 
{
	public void add(int a, int b);
}


//Without lambda Expression
//class Demo implements Example3
//{
//	public void add(int a, int b)
//	{
//		System.out.println("The Sum:"+(a+b));
//	}
//}
//
//
//class Eg3
//{
//	public static void main(String[] args) {
//		Example3 e = new Demo();
//		e.add(10,20);
//	}
//}