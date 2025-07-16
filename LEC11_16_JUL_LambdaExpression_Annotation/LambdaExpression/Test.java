package LambdaExpression_16_07;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
	
	public static void main(String[] args) {
		
//		Interf i = (int n)-> System.out.println(n%2==0);
//		i.m1(10);
//		i.m1(5);
		
//		Predicate<Integer> i = (n)-> n%2==0;
//		System.out.println(i.test(10));
//		System.out.println(i.test(9));
		
		Function<Integer, Integer> f = (n)-> n*n;
		System.out.println(f.apply(20));

		

		
	}

}
