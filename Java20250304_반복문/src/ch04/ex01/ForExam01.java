package ch04.ex01;

public class ForExam01 {

	public static void main(String[] args) {

		/*
		 * 반복문
		 * for, while  -> 조건을 만족하는 순간까지 계속 반복, do~while 보다 많이 사용된다
		 * for         -> 반복 횟수를 알 때
		 * while       -> 몇번 반복하는지 모를 때
		 * do~while    -> 조건을 만족하는 순간까지 계속 반복(단, 최소 1회는 보장)
		 */
		
		int sum = 0;
		
		for(int i=1; i<=5; i++) {    //1~5까지 5회 반복,   for(초기값; 조건; 값의 변동)   초기값 sum:0, i:1
			sum += i;       //sum = sum + 1
		}
		System.out.println("sum = " + sum);
		
	}
}

//조건이 참이면 실행
//조건이 거짓이면 튕겨나간다
