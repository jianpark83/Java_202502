package ch04.ex01;

import java.util.Scanner;

public class ForExam4_배열5 {

	public static void main(String[] args) {

		//7명학생 점수 입력받아서, 총점, 평균 구하기
		
		Scanner sc = new Scanner(System.in);
		//예시>> int num = 0;
		
		//배열 자체에 아래와 같이 초기값을 줄 수 있다, 초기값이 없을 경우 자동으로 0 값으로 세팅
		//초기값을 줄 경우 new int[] 값을 비워둬야 한다
		int[] student = new int[] {99,88,-1,33,100,80,50};   //키보드 입력 안받을 경우
		
		//int[] numA = new int[5];  //정수만 넣을 수 있다
		//실수일 경우 double[] numA = new double[5]; 
		
		int sum = 0;
		double average = 0;
	
		for(int i=0; i<7; i++) {
			
			sum += student[i];
		}
		
		average = sum/7.0;
		
		System.out.printf("총점 : %d, 평균 : %.2f\n", sum, average);
		System.out.println("7번째 값 출력 : " + student[6]);
		
		System.out.println("----------------------");
		
		//max   {99,88,-1,33,100,80,50}	
		    
		int max = student[0];  //변수 초기값 변경 가능
		int min = student[0];  
	
		for(int i=0; i<7; i++) {   //0~6까지 6번 회전해라
			if(max < student[i])
				max =  student[i];
			
			if(min > student[i]) 
				min = student[i];
		}
		
		System.out.println("최대값 : " + max);   //100
		System.out.println("최소값 : " + min);   //33
		
		System.out.println("----------------------");
		/*
		  {-1, -3, -700, 1, 2, 9, 3}
		  키보드 : 1입력하면, 출력 : 1값은 4번째 위치입니다.
		  키보드 : -3입력하면, 출력 : -3값은 2번째 위치입니다.
		  
		  *반복문, 조건문 이용
		 */
		
		int index = -1;
		int[] num1 = new int[] {-1, -3, -700, 1, 2, 9, 3};
		System.out.println("찾을 숫자를 입력>>");
		int numA = sc.nextInt();
		int i=0;
		for(; i<7; i++) {
			if(numA == num1[i]) {
				index = i;
				break;
			}
				
		}
		
		if(index != -1)
		    System.out.printf("%d값은 %d번째 위치입니다.\n", numA, index+1);
		else
			System.out.printf("%d값은 찾을 수 없습니다.\n", numA);
		
		System.out.println("------------------------");

		/*
		 *  {10, -3, -700, 1, 2, 9, 3};
		 *  
		 *  정렬해서(sort) 출력하기.....{-700, -3, 1, 2, 3, 9, 10} 
		 */
	}

}
