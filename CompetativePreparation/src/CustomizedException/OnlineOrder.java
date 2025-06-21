package CustomizedException;

import java.util.Scanner;

public class OnlineOrder {
	String productName;
	int quantity;
	float price;
	Scanner s=new Scanner(System.in);
	void readData() throws QuntityExceptionHandler{
		System.out.println("Enter the Product Name");
		productName=s.next();
		System.out.println("Enter the Product Quantity ");
		quantity=s.nextInt();
		System.out.println("Enter the Product Price");
		price=s.nextFloat();
		if(quantity>=6){
			//.System.out.println("Only 6 units allowed per person");
			throw new QuntityExceptionHandler("Only 6 units allowed per person");
		}
		else{
			System.out.println("Product Name is "+productName);
			System.out.println("Product Price is "+price);
			System.out.println("Product Quantity "+quantity);
			System.out.println("Total Amount Need to Pay "+(quantity*price));
		}
	}
	public static void main(String[] args) {
		OnlineOrder on=new OnlineOrder();
		try {
			on.readData();
		}
		catch (QuntityExceptionHandler qe)
		{
			System.out.println(qe);
		}
	}

}
