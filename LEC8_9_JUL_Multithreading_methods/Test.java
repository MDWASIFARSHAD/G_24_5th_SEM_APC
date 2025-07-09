package multithreading_09_07;

public class Test {
	
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.start();
		

		
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println("parent class");
//			try
//			{
//				Thread.sleep(4000);
//
//			}
//			catch (InterruptedException e) {
//				// TODO: handle exception
//			}
		}
	}

}
