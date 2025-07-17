package OptionalExample;

import java.util.Optional;

public class OptionalExample {
	
	
	public static void main(String[] args) {
		
		String s = "";
		String s1 = "Wasif";
		System.out.println(s1.length());
//		System.out.println(s.length());
		
		Optional<String>  obj = Optional.ofNullable(s);
		System.out.println(obj.orElse("Wasif"));

	}

}
