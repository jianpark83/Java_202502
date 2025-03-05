package ch01.ex01;

public class 정렬 {

	public static void main(String[] args) {

		int[] numArr = new int[10];
		int tmp;
		
		//System.out.println( (int)(Math.random()*100)+1 );     앞에 int를 붙여서 정수로 만든다
		
		//랜덤하게 1~100사이 값을 배열에 넣는다
		for(int i=0; i<10; i++) {
			tmp = (int)(Math.random()*100)+1;   //int 정수로 추출, +1 하면서 100값까지
			numArr[i] = tmp;
			
		}
		//랜덤하게 배열 저장된 값 출력, 실행할때마다 달라짐
		for(int i=0; i<10; i++)
			System.out.println(numArr[i] + " ");
			
		
		
		
	}

}
