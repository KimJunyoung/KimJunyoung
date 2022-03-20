package inheritance;

public class OverridingTest {

	public static void main(String[] args) {

	/*Customer customerKim = new Customer(10010,"Kim");	
	int price = customerKim.calcPrice(10000);
	System.out.println(price + "  " +customerKim.showCustomerInfo());
	
	VIPCustomer customerJung = new VIPCustomer(10020,"JUNG",100);
	price = customerJung.calcPrice(10000);
	System.out.println(price + "  " + customerJung.showCustomerInfo());
	*/
		
		Customer customerWho = new VIPCustomer(100010,"Who",100);
		int price = customerWho.calcPrice(10000);
		System.out.println(price + "  " + customerWho.showCustomerInfo());  
	}

}
