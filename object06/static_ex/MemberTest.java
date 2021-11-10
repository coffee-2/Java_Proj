package object06.static_ex;

public class MemberTest {
	boolean login(String ID, String password) {
		return true;}
	void logout(String ID) {}
	
	public static void main(String[] args) {
		Member member1 = new Member();
		member1.setID("Park");
		member1.setPassword("1234");
		
		
		MemberTest memberTest = new MemberTest();
		
		
		boolean result = memberTest.login("Park", "1234");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberTest.logout("Park");}
		else System.out.println("ID 또는 password가 올바르지 않습니다.");}
}