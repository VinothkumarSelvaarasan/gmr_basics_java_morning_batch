 package MultiThread;

public class SimpleThread extends Thread{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try
			{
				Thread.sleep(1500);	
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		SimpleThread st=new SimpleThread();
		SimpleThread st1=new SimpleThread();
		st.start();
		st1.start();
		
	}

}
