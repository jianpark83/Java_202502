package ex02;

/*
 * 멤버이너클래스
 */

class Outer {
	
	private int num=0;  //인스턴스 변수
	
	void func() {};
	
	class Member{
		void add(int n) { num = n; }
		int get() { return num; }
	}
}

public class MemberInnerClass {

	public static void main(String[] args) {
		
		Outer outer1 = new Outer();  //바깥쪽(Outer) 객체 먼저 생성해야 한다
		Outer.Member outer1M1 = outer1.new Member();  //그 다음 내부 생성!
		
		outer1M1.add(5);  //그래야 접근 가능~
		System.out.println(outer1M1.get());
		
		Outer outer2 = new Outer();
		Outer.Member outer2M2 = outer2.new Member();
			
		outer2M2.add(9);
		System.out.println(outer2M2.get());
		
	}
}