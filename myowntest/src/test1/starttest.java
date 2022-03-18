package test1;

import	test1.Student;

public class starttest {

	public static void main(String[] args) {
		Student studentkim = new Student("KIM",1001);
		studentkim.addSubject("수학", 100);
		studentkim.addSubject("국어", 90);
		
		studentkim.showinfo();

	}

}
