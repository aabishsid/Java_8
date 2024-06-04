package java8_basics;

import java.util.function.Predicate;

//To check whether the given number is even or not 
public class Example2 {

	public static void main(String[] args) 
	{
		Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(4));
		System.out.println(p.test(5));
		
	}

}
