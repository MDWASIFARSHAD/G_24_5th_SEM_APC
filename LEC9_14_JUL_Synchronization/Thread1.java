package SYnchronization_14_07;

public class Thread1 extends Thread{
	
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			Test.counter();
		}
	}

}
