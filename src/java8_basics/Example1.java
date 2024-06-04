package java8_basics;

import java.util.function.Function;

public class Example1 {

	public static void main(String[] args) 
	{
		Function<Integer,Integer> f=i->i*i; 
		System.out.println("The square of 40:"+f.apply(40));
		System.out.println("The square of 50:"+f.apply(50));

		}

}
