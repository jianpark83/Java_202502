package ex05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam01 {

	public static void main(String[] args) {

		Set<String> list = new HashSet<>();   //HashSet : 순서의 보장이 없다
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(String str : list)      //향상된 For문
			System.out.println(str);
		System.out.println();
		System.out.println("--------------------------------");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
	
	}
}
