package java8_basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class MyComparator implements Comparator<Integer>
{
	public int compare(Integer I1, Integer I2) 
	{	
		if(I1<I2)
		{
			return -1;
		}
		if(I1>I2)
		{
			return +1;
		}
		else
		{
			return 0;
		}	
	}
	
//	{
//		return(I1<I2)?-1:(I1>I2)?1:0;
//	}
	
}

class Example5 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(25);
		l.add(15);
		l.add(35);
		System.out.println(l);
		Collections.sort(l, new MyComparator());
		System.out.println(l);

     }
}
