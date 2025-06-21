package Interface_LooselyCoupled;

public class MainClass {
	private InformationProvider ip;

	public void setIp(InformationProvider ip) {
		this.ip = ip;
	}
	public static void main(String[] args) {
		MainClass mc=new MainClass();
		InformationProvider sp=new StudentInformation();
		mc.setIp(sp);
		mc.ip.getData();
		mc.ip.printData();
		
	}
	

}
