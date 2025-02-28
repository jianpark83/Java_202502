package ch02.sec01;

public class VariableExchangeExam {

	public static void main(String[] args) {
      
	  int x = 5;
      int y = 7;
      System.out.println("(before)");
      System.out.println("x:" + x + ", y:" + y);
      
      int z = x;
      x = y;
      y = z;
      System.out.println("(after)");
      System.out.println("x:" + x + ", y:" + y);
	}

}
