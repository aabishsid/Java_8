package java8_basics;

public class Eg3 {

	public static void main(String[] args) 
	{
		Example3 e = (a,b)-> System.out.println("The Sum: " +(a+b));
		e.add(10, 20);
		e.add(50, 50);
		e.add(200, 200);
		
	}

}
