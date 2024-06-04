package java8_basics;

import java.util.ArrayList;
import java.util.Collections;

class Employee
{
	String name;
	int eno;

	Employee(String name,int eno)
	{
		this.name=name;
		this.eno=eno;
	}
	
	public String toString()
	{
		return eno+ ": "+name;
	}

	
public static class Employeeee
{
	public static void main(String[] args)
	{
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Aman",12345));
		l.add(new Employee("Rohan",67890));
		l.add(new Employee("John",24680));
		l.add(new Employee("Jenny",12678));
		l.add(new Employee("Bunny",85910));
		System.out.println(l);
		Collections.sort(l,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(l);		
	}
}
}

