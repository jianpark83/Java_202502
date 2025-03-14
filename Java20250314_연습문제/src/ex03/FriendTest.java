package ex03;

public class FriendTest {

	public static void main(String[] args) {

		Friend friends[] = new Friend[5];
		
		friends[0] = new Friend("내장산", "010-1111-6666", "abcd@naver.com");
		friends[1] = new Friend("백두산", "010-2222-7777", "test@naver.com");
		friends[2] = new Friend("지리산", "010-3333-8888", "ehde@naver.com");
		friends[3] = new Friend("북한산", "010-4444-9999", "asft@naver.com");
		friends[4] = new Friend("한라산", "010-5555-0000", "etry@naver.com");
		
		System.out.println("이름" + "        " + "전화번호" + "        " + "메일주소");
	    System.out.println("------------------------------------");
	    
		for(int i=0; i<friends.length; i++)
		System.out.println(friends[i].getInfo());	
	}
}
