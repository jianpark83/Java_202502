package ex08;
//클래스 정의와 객체(인스턴스) 생성 실습 1
public class Book {

	private String title;   
	private String author;  
	private int price;      
	
	public Book() {
		this("자바의 정성", "남궁석", 35000);
    //title = "자바의 정석";
    //author = "남궁석";
	//price = 35000;
	}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;	
	}
    
	String getBookInfo() {
		return "title: " + title + " / author: " + author + " / price: " + price;
	}
}
