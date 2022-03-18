package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		Book[] bookArray3 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥1", "조정");
		bookArray1[1] = new Book("태백산맥2", "조정");
		bookArray1[2] = new Book("태백산맥3", "조정");
		
		bookArray3[0] = new Book();
		bookArray3[1] = new Book();
		bookArray3[2] = new Book();
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo(); 
		}
		
		
		bookArray1[0].setAuthor("하이");
		bookArray1[0].setBookName("나목 ");
		
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookInfo(); 
		}
		
		System.out.println("============");
		
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo(); 
		}
		
		System.out.println("============");
		
		for(int i=0;i<bookArray2.length;i++) {
			bookArray3[i].setAuthor(bookArray1[i].getAuthor()); 
			bookArray3[i].setBookName(bookArray1[i].getBookName());
			bookArray3[i].showBookInfo();
		}
		
		bookArray3[0].setAuthor("김준영");
		bookArray3[0].setBookName("안녕하세요");
		
		System.out.println("============");
		
		for(int i=0;i<bookArray2.length;i++) {
			bookArray3[i].showBookInfo();
		}
		
		
		String[] strArr = {"Java", "Android", "C" };
		for(String a : strArr) {
			System.out.println(a);
		}
	}

}
