package multithreading_09_07;

public class Test1 {
	
	public static void main(String[] args) {
		
		MyThread1 mt1 = new MyThread1();
//		mt1.start();
		
		Thread t = new Thread(mt1);
		
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("parent class");
		}
	}

}
