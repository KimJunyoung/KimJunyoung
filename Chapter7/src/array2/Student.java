package array2;

import java.util.ArrayList;

import array1.Subject;

public class Student {

	
	private String studentname;
	private int studentID;
	ArrayList<Subject> subjectlist = new ArrayList<Subject>();
	
	public Student(int studentID, String studentname) {
		this.studentID = studentID;
		this.studentname = studentname;
		
		
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		
		subjectlist.add(subject);
	}
	
	public void showinfo() {
			int total = 0;
		for(Subject subject : subjectlist) {
			
			total += subject.getScore();
			System.out.println("학생" + studentname + "님의" + subject.getName() + "과목의 성적은 " +subject.getScore() + "입니다");
		}
		System.out.println("학생" + studentname + "님의 총점" + total + "점 입니다" );
		
		

	
}

}