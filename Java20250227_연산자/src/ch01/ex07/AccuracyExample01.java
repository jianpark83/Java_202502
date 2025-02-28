package ch01.ex07;

public class AccuracyExample01 {

	public static void main(String[] args) {

		double sum = 0;
		
		for(int i=0; i<30; i++)   //0.1을 30번 누적 => 3.0 ,정확한 계산은 실수로 하지 않는 것이 좋다(가급적 정수)
			sum = sum + 0.1;
		
		System.out.println(sum);
		
	}

}
