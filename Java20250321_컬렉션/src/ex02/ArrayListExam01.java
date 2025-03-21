package ex02;

import java.util.ArrayList;

public class ArrayListExam01 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();   //ArrayList 배열이 만들어짐, 주소값이 들어간다
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
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
