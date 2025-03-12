package ch02.ex06;

public class Korean {

	//인스턴스 fianl 필드 선언
	final String nation = "대한민국";
	final String ssn;
	
	//인스턴스 필드 선언
	String name;
	
	//생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
//페이지 255