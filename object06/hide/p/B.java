package object06.hide.p;

public class B {
	public int n;  ///public ���� �����ڴ� ��� ������ ���� ����
	public void n() {
		n=5;}
	
	protected int k;  ///protected ���� �����ڴ� ���� ��Ű������ ���� ����
					  ///�ٸ� ��Ű���� ���� ��Ӱ��迡 �־�� ���� ����
	protected void k() {
		k=7;}
	
	int m;        ///default ���� �����ڴ� ����� �� ���� �׻� �����Ǿ� ����
	              ///���� ��Ű���� ���� ����, �ٸ� ��Ű���� ���� �Ұ�
	 void m() {
		m=10;}
	
	private int p;  ///private ���� �����ڴ� ���� Ŭ������������ ���� ����
	void p() {
		p=20;}
	
}///class
