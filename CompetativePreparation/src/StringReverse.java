
public class StringReverse {
	public static void main(String[] args) {
		String myNation="Vinothkumar Selvaarasan";
		String reverse="";
		for (int i=myNation.length()-1;i>=0;i--)
		{
			reverse=reverse+myNation.charAt(i);
		}
		System.out.println(reverse);
	}

}
