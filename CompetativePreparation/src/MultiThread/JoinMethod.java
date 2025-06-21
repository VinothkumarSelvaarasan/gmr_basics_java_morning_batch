package MultiThread;

public class JoinMethod extends Thread{
	public void run(){
		for(int i=0;i<=10;i++){
			try{
				Thread.sleep(1500);	
			}
			catch(InterruptedException ie){
				System.out.println(ie);
			}
			System.out.println(i);
		}   }
	public static void main(String[] args) {
		JoinMethod jt=new JoinMethod();
		JoinMethod jt1=new JoinMethod();
		JoinMethod jt2=new JoinMethod();
		jt.start();
		try{
			jt.join();
		}
		catch (Exception e) {  System.out.println(e);  }
		jt1.start();
		jt2.start();
	}

}
