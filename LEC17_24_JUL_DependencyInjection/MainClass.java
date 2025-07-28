package DependencyInjection_24_07;

public class MainClass {
	
	public static void main(String[] args) {
		
		Phone p = new Phone();
		Iphone i = new Iphone(p);
		
		i.security();
	}

}
