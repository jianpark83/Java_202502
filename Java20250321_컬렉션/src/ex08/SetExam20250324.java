package ex08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " & " + age;
	}
	
	/*
	 * 나이 정렬
 	@Override
	public int compareTo(Person o) {
		return Integer.compare(this.age, o.age);
	}
	*/
	
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}

public class SetExam20250324 {

	public static void main(String[] args) {
	
		Set<Person> p = new TreeSet<Person>();
		
		p.add(new Person("AAA", 20));
		p.add(new Person("BBB", 10));
		p.add(new Person("AAA", 20));
		p.add(new Person("BBB", 10));
		p.add(new Person("DDD", 30));
		p.add(new Person("FFF", 60));
		p.add(new Person("GGG", 45));
		
		Iterator<Person> itr = p.iterator();
		while(itr.hasNext())
	}

}
