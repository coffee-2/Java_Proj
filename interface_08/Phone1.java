package interface_08;

public interface Phone1 { 
	//�������̽� : Ŭ���̾�Ʈ�� ȸ�系���� ���� ���񽺸� ����� �� �ִ� ����
	//�������̽� ���� ���, �߻�޼ҵ�, default �޼ҵ尡 �� �� ����. ������ ��ü ���� �Ұ�!
	
	public static final int timeout = 10000;
	public abstract void sendcall();
	public abstract void receivecall();
	public default void printLogo() {System.out.println(" �ΰ� ");}
	
}
