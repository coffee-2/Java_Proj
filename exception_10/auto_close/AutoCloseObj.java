package exception_10.auto_close;

public class AutoCloseObj implements AutoCloseable{
						//자동으로 객체를 close. AutoCloseable 인터페이스 구현 필요
						//close() 메소드 오버라이딩 필요
						//try(resource) {} 구문 사용
	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close(), 제거되었습니다.");} 
	
	
}
