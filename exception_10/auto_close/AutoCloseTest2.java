package exception_10.auto_close;

public class AutoCloseTest2 {

	public static void main(String[] args) {
		try(AutoCloseObj obj = new AutoCloseObj()) {throw new Exception();}
		catch(Exception e) {System.out.println("���� ��� �Դϴ�.");}
		
		System.out.println("���α׷� ����");
		
		
	}////main	
}///////class

/*
 throw 	: Exception�� ������ �߻� ��Ŵ
 throws : Exception�� �̷�� ��
 */
