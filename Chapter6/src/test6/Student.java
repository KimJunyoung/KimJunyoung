package test6;

public class Student {

	String StudentName;
	int money;
	int Count;
	
	
	public Student(String name, int money) {
		this.StudentName = name;
		this.money = money;
	}
	
	public void takebus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void Showinfo() {
		System.out.println(StudentName + "의 남은 금액은 " + money +"입니다 ");
	}
}
