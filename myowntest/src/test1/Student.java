package test1;

import java.util.ArrayList;


public class Student {

	
	private String name;
	private int num;
	ArrayList<Subject> subjectlist = new ArrayList<Subject>();
	
	public Student(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	
	public void addSubject(String na,int n) {
		Subject subject = new Subject();
		subject.setName(na);
		subject.setScore(n);
		
		subjectlist.add(subject);
	}
	
	
	public void showinfo() {
		int total = 0;
		
		for(Subject subject : subjectlist) {
			total += subject.getScore();
			
			System.out.println("학생" +name + "님의" + subject.getName() + "과목의 성적은 " +subject.getScore() + "입니다");
		}
		System.out.println("학생" + num + "님의 총점" + total + "점 입니다" );
		
			
		
	}
}
