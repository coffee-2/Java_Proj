package interface_08;

public interface Phone1 { 
	//인터페이스 : 클라이언트가 회사내부의 서버 서비스를 사용할 수 있는 접점
	//인터페이스 내에 상수, 추상메소드, default 메소드가 올 수 있음. 변수와 객체 생성 불가!
	
	public static final int timeout = 10000;
	public abstract void sendcall();
	public abstract void receivecall();
	public default void printLogo() {System.out.println(" 로고 ");}
	
}
