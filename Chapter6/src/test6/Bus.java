package test6;

public class Bus {
	int Busnum;
	int money;
	int Count;
	
	public Bus(int Busnum) {
		this.Busnum = Busnum;
	}
	
	
	public void take(int money) {
		this.money += money;
		this.Count++;
	}
	
	public void showInfo() {
		System.out.println("버스의 수익은 " + money + "이며, 탑승객 숫자는 " + Count + "입니다.");
	}
}
