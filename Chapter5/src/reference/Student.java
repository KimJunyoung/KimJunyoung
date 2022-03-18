	package reference;

public class Student {
	int studentID;
	String studentName;

	Subject korea;
	Subject math; // 선언만 한다고 클라스가 생기는게 아니다.
	

	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		korea = new Subject();
		math = new Subject();
	}

	public void setKorea(String name, int score) {
		korea.setSubjectName(name);
		korea.setScore(score);
	}
	
	public void setMath(String name, int score) {
		math.setSubjectName(name);
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + " 학생의 총점은 : " + total);
		
	}
	
}
