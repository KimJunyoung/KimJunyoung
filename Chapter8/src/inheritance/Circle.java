package inheritance;

public class Circle {

	Point point;
	
	private int radius;
	
	public Circle(int x,int y) {
		point = new Point();
		point.setX(x);
		point.setY(y);
	}
	
}


/* public class Circle extends Point{
} */ // Point 의 x,y를 사용하고 싶어서 상속을	하는건 맞지않다. 일반적인것과 구체적인 관계가 아니라 오로지 x,y를 쓰고 싶은 경우이기 때문이
