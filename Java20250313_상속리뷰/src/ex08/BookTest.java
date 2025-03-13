package ex08;

/*
 * int[] numArr = new int[5];
   numArr[0] = 10;
   numArr[1] = 20;
 * 
 */

public class BookTest {

	public static void main(String[] args) {
		Book[] books = new Book[5];
		
		books[0] = new Book();
		books[1] = new Book("이것이 자바다", "신용권", 38000);
		books[2] = new Book("열혈JAVA", "윤성우", 35000);
		books[3] = new Book("HTML", "홍길동", 18000);
		books[4] = new Book("JS", "김자바", 28000);
		
	for(int i=0; i<books.length; i++)
		System.out.println(books[i].getBookInfo());
		
	}
}
