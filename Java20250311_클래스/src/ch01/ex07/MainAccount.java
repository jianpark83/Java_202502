package ch01.ex07;

public class MainAccount {

	public static void main(String[] args) {

		Account acc = Account.getInstance();
		
		acc.setBalance(100);   
		
		System.out.println(acc.getBalance());
		
		Account acc2 = Account.getInstance();
		System.out.println(acc2.getBalance());
		
	}
}
//acc, acc2 모두 내부 ac 객체를 참조한다
//확인하기 위해 100 값을 넣어 실행함