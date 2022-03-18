package array1;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(1001, "LEE");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		
		studentLee.showStudentInfo();
		
		System.out.println("_______________");
		
		
		Student studentKim = new Student(1002, "KIM");
		studentKim.addSubject("국어", 80);
		studentKim.addSubject("수학", 90);
		
		studentKim.showStudentInfo();
	}

}
