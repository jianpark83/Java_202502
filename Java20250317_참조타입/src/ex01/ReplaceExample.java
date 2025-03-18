package ex01;

public class ReplaceExample {

	public static void main(String[] args) {

        //문자열 대체 예제 p.162
		
		String oldStr = "자바 문자열은 불면입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
//문자열 원본 자체는 수정이 안된다