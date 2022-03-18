package test6;

public class taketest {

	public static void main(String[] args) {
		
		Student Jun = new Student("준영", 30000);
		
		Bus bus100 = new Bus(100);
		
		Jun.takebus(bus100);
		Jun.Showinfo();
		bus100.showInfo();

	}

}
