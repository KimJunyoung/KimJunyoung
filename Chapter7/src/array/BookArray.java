package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] lib = new Book[5]; // 주소 자리 공간을 만들어 
		
	
		
		
		lib[0] = new Book("1", "조정");
		lib[1] = new Book("2", "조정");
		lib[2] = new Book("3", "조정");
		lib[3] = new Book("4", "조정");
		lib[4] = new Book("5", "조정");
		
		for(int i=0;i<lib.length;i++) {
			lib[i].showBookInfo();
		}
		
		
	
	}

}
