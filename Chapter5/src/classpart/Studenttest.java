package classpart;

public class Studenttest {

	public static void main(String[] args) {

		Student studentKim = new Student();
		studentKim.studentName = "김준영";
		studentKim.address ="은남1길";
		
		Student studentlim = new Student();
		studentlim.studentName = "이준";
		studentlim.address ="은남2길";
		
		
		studentKim.showStudentInfor();
		studentlim.showStudentInfor();
		
		
		System.out.println(studentKim);
		System.out.println(studentlim);
		
	}

}
  