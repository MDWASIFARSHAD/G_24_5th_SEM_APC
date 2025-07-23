package HigherOrderFunction_23_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class HOFExample1 {
	
	public static void main(String[] args) {
		
//		Interf i = () -> System.out.println("m1 method is used");
//		
		HOFExample1 h = new HOFExample1();
//		h.print(i);
		
		List<Integer> l = Arrays.asList(4,3,5,6,7,8);
		
		Function<Integer,Integer> f = (n)->n*n;
		System.out.println(h.square(f, l));
		
		
		
		
//		i.m1();
	}
	
	public ArrayList<Integer> square(Function<Integer,Integer> f,List<Integer> l)
	{
		
		ArrayList<Integer> ar = new ArrayList<>();
		for(Integer i:l)
		{
			ar.add(f.apply(i));
		}
		return ar;
		
	}
	
//	public void print(Interf i)
//	{
//		i.m1();
//		System.out.println("print method is called");
//	}

}
