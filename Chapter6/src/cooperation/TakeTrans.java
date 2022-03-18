package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student Jun = new Student("준영", 30000);
		Student Lee = new Student("이근", 24000);
		
		Bus bus100 = new Bus(100);
		Jun.takeBus(bus100);
		Lee.takeBus(bus100);
		bus100.showInfo();
		
		
		Subway subway7 = new Subway(7);
		Lee.takeSubway(subway7);
		subway7.showInfo();
		
		Jun.showInfo();
		Lee.showInfo();
	}

}
