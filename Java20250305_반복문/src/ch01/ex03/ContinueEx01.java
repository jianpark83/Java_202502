package ch01.ex03;

public class ContinueEx01 {

	public static void main(String[] args) {

		//1~100사이에서 홀수 합 구하기
		int sum = 0;
		
		for(int i=0; i<=100; i++){
			if(i%2 == 1)
			sum += i;
		}
		System.out.println(sum);
		
		int sum2 = 0;
		
		for(int i=0; i<=100; i++) {
			if(i%2 == 0) continue;      //조건이 참일 경우 다음 문장 실행하지 않고 다음 반복(i++) 실행
			sum2 += i;                
		}
		System.out.println(sum2);
	}

}
