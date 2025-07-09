package multithreading_09_07;

public class MyThread1 implements Runnable{
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child class");
		}
	}

}
