package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		/*
		Customer customerJun = new Customer();
		customerJun.setCustomerID(10100);
		customerJun.setCustomerName("JUN");
		*/
		
		
		VIPCustomer customerJunG = new VIPCustomer(10000,"JUNG",100);
		customerJunG.setCustomerID(10101);
		customerJunG.setCustomerName("JUNG");
		
		customerJunG.bonusPoint=1000;
		
		//System.out.println(customerJun.showCustomerInfo());
		System.out.println(customerJunG.showCustomerInfo());
	}

}
