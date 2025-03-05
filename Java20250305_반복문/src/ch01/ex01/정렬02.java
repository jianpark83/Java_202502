package ch01.ex01;

import java.util.Random;    //이게 설정되어 있어야 함

public class 정렬02 {

	public static void main(String[] args) {

		//int seed = 12345;
		//Random random = new Random(seed);        //seed 값이 정해져있다, 실행시 계속 같은 값이 나온다(랜덤하지 않다)
		
		Random random = new Random();        
		
		
		int[] numArr = new int[5];   //배열의 경우 모두 0으로 초기값 자동세팅
		int tmp;
		
		//System.out.println( (int)(Math.random()*100)+1 );     앞에 int를 붙여서 정수로 만든다
		
		//랜덤하게 1~100사이 값을 배열에 넣는다
		for(int i=0; i<numArr.length; i++) {      //numArr.length 상단 배열의 길이값을 자동 반영한다
			tmp = (int)random.nextInt(100)+1;
			numArr[i] = tmp;
			
		}
		//랜덤하게 배열 저장된 값 출력, 실행할때마다 달라짐
		for(int i=0; i<numArr.length; i++)
			System.out.print(numArr[i] + " ");
			
		System.out.println();
		System.out.println();		
		
		//최대값, 최소값 출력
		int max, min;
		max = min = numArr[0];
		
		for(int i=1; i<numArr.length; i++) {        //0부터 할경우 첫번재 숫자끼리 비교하기 때문에 다음 숫자와 비교할 수 있도록 1로 지정
			if(max < numArr[i])         //최대값
			   max =  numArr[i];
					
			if(min > numArr[i])         //최소값
			   min = numArr[i]; 
				}
		
		System.out.println("최대값: " + max + ", 최소값: " + min);

	    System.out.println();
	    //총점, 평균
	    
	    int sum = 0;
	    double avg = 0;
	    
	    for(int i=0; i<numArr.length; i++) 
	    	sum += numArr[i];
	    	avg = (double)sum / numArr.length;    //numArr.length를 사용하면 임의로 실수로 결과 도출하고 싶으면 실수 지정을 해야함
	    	                                      //정수/정수 => 정수, 정수/실수 => 실수
	   
	    System.out.printf("총점: %d, 평균: %.2f\n", sum, avg);
	    System.out.println();
	    
	    //정렬~(버블정렬)
		int temp;
		for(int i=0; i<numArr.length; i++) {          //총회전, 자리를 비굑하면서 가장 큰 값이 뒤로 가도록 정렬하는 총회전 횟수
			for(int j=0; j<numArr.length-1; j++) {    //자리비교, 큰값을 뒤로 보내기 위해 앞뒤수 비교, -1 감소시켜야지 마지막 숫자와 비교후 종료가능
	      //for(int j=0; j<numArr.length-1-i; j++) {  //-i 값만큼 회전을 덜 하겠다, 불필요한 자리비교 안함
				if(numArr[j] > numArr[j+1]) {
					temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
				}
			}
		}
	    for(int i=0; i<numArr.length; i++)
	    	System.out.print(numArr[i] + " ");
		
	}

}
