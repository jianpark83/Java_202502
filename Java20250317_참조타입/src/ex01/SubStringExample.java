package ex01;

public class SubStringExample {

	public static void main(String[] args) {

		//문자열 잘라내기 p.163
		
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}
