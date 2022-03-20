package inheritance;

public class GOLDCustomer extends Customer {


	public GOLDCustomer() {
		
		customerGrade = "GOLD";
		bonusRatio = 0.05;
	
	}
	
	
	
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return super.calcPrice(price);			// Ratio 값만 0.05 로 변경 후 Customer 의 calcPrice 사
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo();
	}
	
	

}
