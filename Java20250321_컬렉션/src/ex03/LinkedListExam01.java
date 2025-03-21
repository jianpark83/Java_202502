package ex03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam01 {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();   //List 배열이 만들어짐, 주소값이 들어간다
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();
		
		for(String str : list)
			System.out.println(str);
		System.out.println();
		
		list.remove(0);    //삭제
		System.out.println(list.get(0));
		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		System.out.println();
		
		list.clear();  //all 삭제
//		System.out.println(list.get(0));
		
	}
}
