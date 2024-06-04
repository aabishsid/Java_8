package java8_basics;

public class Eg4 {

	public static void main(String[] args) 
	{
		Example4 e = n -> n*n;
		System.out.println(e.squareIt(4));
		System.out.println(e.squareIt(5));
		System.out.println(e.squareIt(6));
		
	}
}
