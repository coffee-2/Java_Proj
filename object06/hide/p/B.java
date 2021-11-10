package object06.hide.p;

public class B {
	public int n;  ///public 접근 지정자는 모든 곳에서 접근 가능
	public void n() {
		n=5;}
	
	protected int k;  ///protected 접근 지정자는 같은 패키지에서 접근 가능
					  ///다른 패키지일 때는 상속관계에 있어야 접근 가능
	protected void k() {
		k=7;}
	
	int m;        ///default 접근 지정자는 명시할 수 없고 항상 생략되어 있음
	              ///같은 패키지는 접근 가능, 다른 패키지는 접근 불가
	 void m() {
		m=10;}
	
	private int p;  ///private 접근 지정자는 같은 클래스내에서만 접근 가능
	void p() {
		p=20;}
	
}///class
