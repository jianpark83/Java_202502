package ch04.ex01;

public class ForExam02 {

	public static void main(String[] args) {
		
		
		//1~100가지 홀수 합
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {  //1~100까지 반복   
			if(i % 2 == 1) {         //홀수 이니? , 짝수는 (i % 2 == 0)
			sum += i;                //홀수이면 누적
			}
		}
		System.out.println("sum = " + sum);
		
	}

}
//응용 => i를 2로 나눈 후 나머지 값이 1이면 홀수, 나머지 값이 0이면 짝수