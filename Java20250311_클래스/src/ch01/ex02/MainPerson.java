package ch01.ex02;

public class MainPerson {

	public static void main(String[] args) {

		Person p1 = new Person();  //객체 생성하면 스틱과 힙영역에 개별적으로 P1, P2 영역을 만든다
		Person p2 = new Person();
		
		
	}

}


//스틱영역 => P1 , 힙영역 => P1의 name, age.. , 메소드영역
//스틱영역 => P2 , 힙영역 => P2의 name, age.. , 메소드영역
//P1은 P1을 참조, P2는 P2를 참조하지만,

//p1 = p2;를 넣을 경우 둘다 p2를 참조(둘다 똑같은 객체를 사용할 수 있도록 가능)
//p1, p2는 p2가 참조하는 객체를 동시 참조하게 된다

//p1이 참조한 객체는 일정시간 지나면 메모리 공간에서 소실된다
//가비지컬렉터 = 필요없는 데이터 삭제(쓰레기차)