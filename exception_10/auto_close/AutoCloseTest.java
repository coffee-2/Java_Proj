package exception_10.auto_close;

public class AutoCloseTest { //���ܰ� �߻����� �ʴ� ���

	public static void main(String[] args) { //try(resource) {}
		try(AutoCloseObj obj = new AutoCloseObj()) {}
		catch(Exception e) {System.out.println("���� ��� �Դϴ�.");}
		
		System.out.println("���α׷� ����");
		
		
	}////main
}///////class
