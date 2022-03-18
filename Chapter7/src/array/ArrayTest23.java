package array;

import java.util.ArrayList;

public class ArrayTest23 {

	public static void main(String[] args) {
		
		
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("태백산맥" , "조정래"));
		library.add(new Book("데미안" , "헤세"));
		library.add(new Book("토지" , "박경리"));
		
		
		for(int i=0; i<library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		
		System.out.println();

	}

}
