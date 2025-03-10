package ch01.ex04;

class GrandParent{
	private String 할아버지성함;        //private가 붙을 경우 getter를 이용한다
	
	GrandParent(String 할아버지성함){
		this.할아버지성함 = 할아버지성함;
	}
	
	void displayInfo() {
    	System.out.println("할아버지 성함은 " + 할아버지성함);
    }
}

class Parent extends GrandParent{
	private int 아버지연세;
	
	Parent(String 할아버지성함, int 아버지연세){
		super(할아버지성함);    //상위클래스 생성자 호출(인자값 1개 받을 수 있는)
		this.아버지연세 = 아버지연세;
	}
	
	void displayInfo() {
		super.displayInfo();   //상위클래스에 있는 메소드를 호출한다
    	System.out.println("아버지 연세는 " + 아버지연세);
    }
}

class Child extends Parent{  
	String 나의취미;
	
	Child(String 할아버지성함, int 아버지연세, String 나의취미){
		super(할아버지성함, 아버지연세);   //상위클래스 생성자 호출(인자값 2개 받을 수 있는)
		this.나의취미 = 나의취미;
	}
	
    void displayInfo() {
    	super.displayInfo();  //상위클래스에 있는 메소드를 호출한다
    	System.out.println("나의 취미는 " + 나의취미);
    }
}

public class MainClass {

	public static void main(String[] args) {

		Child child = new Child("김철수", 50, "야구");
		child.displayInfo();	//가장 가까운 것부터 출력된다(내꺼먼저), 상위클래스 출력을 위해서 super 이용
	}
}
/*
 * 할아버지 성함은 김철수
 * 아버지 연세는 50
 * 나의 취미는 야구
 */
//super 기능1. 상위클래스에 있는 생성자를 호출할 수 있다
//super 기능2. 상위클래스에 있는 메소드를 호출할 수 있다