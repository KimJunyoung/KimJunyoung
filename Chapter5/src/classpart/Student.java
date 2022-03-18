package classpart;


public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//public Student() {}	기본 생성자 매개변수 x 	생성자라도 하나가 있으면 디폴드 생성자는 생성되지 않는다  
	
	public void showStudentInfor() {
		System.out.println(studentName + "," + address);
		
	}
	
	public String getStudnetName() {
		return studentName;
		
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	

}
