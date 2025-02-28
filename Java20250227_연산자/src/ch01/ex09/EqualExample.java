package ch01.ex09;

public class EqualExample {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 10;
		
		String str1 = "korea";
		String str2 = "korea";
		
		System.out.println(num1 == num2);
//		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));   //문자열 비교할땐(객체 비교시) equals 사용할 것!!
		
		
		String str3 = new String("korea");      //new를 입력하면 무조건 새로 만든다
		String str4 = new String("korea");      
		
		//System.out.println(str3);
		//System.out.println(str4);
		//System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		System.out.println(str1.equals(str4));
		
		System.out.println(5>2 && 3<1);          //두개 모두 true일 경우 true
		
		System.out.println( (5>2) ^ (3>1) );
		System.out.println( (5>2) ^ (3<1) );
		System.out.println( (5<2) ^ (3>1) );
		System.out.println( (5<2) ^ (3<1) );
		
		System.out.println( !(5<2) );            //반대 (논리값을 바꿈)
		  
	}

}
