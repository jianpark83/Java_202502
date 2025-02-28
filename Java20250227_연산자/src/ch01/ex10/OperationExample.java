package ch01.ex10;

public class OperationExample {

	public static void main(String[] args) {

		int a = 1;
		
		a += 1;                  // a = a + 1; 와 같은 값, 간단하게 입력하기 위해 뒤에 있는 a를 생략시킴
		System.out.println(a);
			
		a++;
		++a;
		System.out.println(a);
		
		a *= 3;                  // 위 a값에서 3을 곱하라는 뜻
		System.out.println(a);
		                
		a -= 10;                 // 위 a값에서 10을 빼라는 뜻
		System.out.println(a);
		

		int b = 10;
		
		b /= 2;
		System.out.println(b);
		
		b *= 4;
		System.out.println(b);
		
		
		
	}

}
