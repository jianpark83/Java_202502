package ex02;

public class ArrayCopyExample {

	public static void main(String[] args) {

		//int[] oldIntArray = new int[] {10,20,30,40,50};
		//int[] oldIntArray2 = new int[5];
		//oldIntArray2[0] = 10;
		
		int[] oldIntArray = {1,2,3};
		
		System.out.println(oldIntArray.length);
		
		int[] newIntArray = new int[6];
		
		//배열복사
		for(int i=0; i<oldIntArray.length; i++) 
			newIntArray[i] = oldIntArray[i];   // => 배열복사		
	
		for(int i=0; i<newIntArray.length; i++)
			System.out.print(newIntArray[i] + " ");
		
		System.out.println();
		
		int[] intArray = new int[10];
		
		System.arraycopy(newIntArray, 0, intArray, 0, newIntArray.length);  // =>배열복사
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " ");
		
		System.out.println();
		//향상된 for문
        for(int i:intArray)
        	System.out.print(i + " ");
		
	}
}
//p.189~190 배열복사 => 배열은 길이를 변경할 수 없기 때문에 늘리고 싶으면 새로 만들어서 이주시켜야 한다