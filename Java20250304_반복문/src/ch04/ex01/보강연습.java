package ch04.ex01;

public class 보강연습 {

	public static void main(String[] args) {

		int[] num = new int[10]; //배열 10개
		
		//빈배열 1~100사이 랜덤하게 저장
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100)+1;
		}
		
		//배열값 출력
		for(int i=0; i<num.length; i++)
			System.out.print(num[i] + " ");
		System.out.println();
		
		//총점 & 평균
		int sum = 0;
		double avg = 0;
		for(int i=0; i<num.length; i++)
			sum += num[i];
		
		avg = (double)sum / num.length;   //정수/정수를 하면 나머지값을 버린다(소수점 이하가 0 값으로 출력)
		                                  //그래서 앞에 double을 붙이면 소수점 이하 자리가 출력 된다
		                                  //총점/10.0으로 나누라는 의미
		System.out.println("총점 : " + sum + ", 평균 : " + avg);
		
		//최대값 & 최소값(공식처럼 외우기!!)
		int max = num[0];  //배열의 첫번째 값을 넣는다
		int min = num[0];
		for(int i=0; i<num.length; i++) {
			if(max < num[i])
				max = num[i];
			
			if(min > num[i])
				min = num[i];		
		}
		
		System.out.println("최대 : " + max + ", 최소 : " + min);
		
		//정렬(버블정렬)  기본:오름차순  i회전 -> 0 1 2 3 4 5 6 7 8 9
		for(int i=0; i<num.length-1; i++) {
			for(int j=0; j<num.length-1-i; j++) {
				
				if(num[j]>num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
		}
		//배열값 출력
		for(int i=0; i<num.length; i++)
			System.out.print(num[i] + " ");
			System.out.println();
	}
}
