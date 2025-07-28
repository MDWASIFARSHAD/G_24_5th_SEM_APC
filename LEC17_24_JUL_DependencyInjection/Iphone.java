package DependencyInjection_24_07;

public class Iphone {
	
	Phone p;
	
	public Iphone(Phone p) {
		// TODO Auto-generated constructor stub
		this.p=p;
	}

	public void security()
	{
		System.out.println("i am secured");
		p.calling();
	}

}
