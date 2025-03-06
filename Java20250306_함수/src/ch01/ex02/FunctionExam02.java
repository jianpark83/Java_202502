package ch01.ex02;

/*
 * 함수 2개 생성
 * 매개변수로 100 정수값을 전달하면
 * 함수1은 1~100 사이 홀수 값을 리턴하고
 * 함수2는 1~100 사이 짝수 값을 리턴한다.
 * 메인함수에서 두 값을 호출하고, 각 전달 값을 출력한다.
 */
public class FunctionExam02 {

	public static void main(String[] args) {

		int[] number = new int[10];            //10개의 배열생성
        //함수호출
	
		for(int i=0; i<10; i++) {              //10~100가지 배열에 넣어준다
			number[i] = (i+1)*10;
		}
			
		for(int i=0; i<10; i++) 
			System.out.print(number[i] + " "); //배열 출력
			System.out.println();
			
		int resultA = evenSum(number); 
			System.out.println(resultA);
			
		int resultB = oddSum(number);
		    System.out.println(resultB);		    
	} 
		
	//함수정의
	public static int evenSum(int[] numA) {   //짝수합              
		              //매개변수 int[] numA  
	    int sum = 0;
	    for(int i=0; i<numA.length; i++) {
//	    	System.out.print(numA[i] + " ");
	    	
	    	int num = numA[i] / 10;
	    	if(num % 2 == 0)      //if( (numA[i] / 10) %2 == 0 )
	    	sum += numA[i];
	    	
	    }
	    return sum;
	}
	
	public static int oddSum(int[] numB) {   //홀수합
		int sum = 0;
		 
		for(int i=0; i<numB.length; i++) {
			 
			if( (numB[i] / 10) % 2 == 1 )
		    sum += numB[i];
			
		}
	    return sum;
	}

}


