package ex01;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {

		//객체를 참조하는 배열 p.188		
		
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		//true: 같은 객체 참조
		System.out.println(strArray[0] == strArray[1]);
		//false: 다른 객체를 참조
		System.out.println(strArray[0] == strArray[2]);
		//true: 문자열이 동일
		System.out.println(strArray[0].equals(strArray[2]));
	}
}
