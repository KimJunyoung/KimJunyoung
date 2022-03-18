package array2;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentkim = new Student(1001,"KIM");
		studentkim.addSubject("수학", 100);
		studentkim.addSubject("국어", 90);
		
		studentkim.showinfo();
	}

}
