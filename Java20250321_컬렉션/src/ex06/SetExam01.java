package ex06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member{
	String name;
	int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {                                  //중복체크하고 싶으면 hashCode와 equals를 적절히 재정의 해서 체크한다
		System.out.println("---------hashCode---------");
		
		int result = name.hashCode() + age;
		System.out.println("result : " + result);
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("----------equals----------");
		Member m = (Member)obj;
		return this.name.equals(m.name) && this.age == m.age;
	}
}

public class SetExam01 {

	public static void main(String[] args) {

		Set<Member> set = new HashSet<>();   //HashSet : 순서의 보장이 없다
		
		set.add(new Member("홍길동", 20));
		set.add(new Member("홍길동", 20));
		set.add(new Member("홍길동", 20));

		for(Member m : set)
			System.out.println(m);	
	}
}
//p.654