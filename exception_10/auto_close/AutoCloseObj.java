package exception_10.auto_close;

public class AutoCloseObj implements AutoCloseable{
						//�ڵ����� ��ü�� close. AutoCloseable �������̽� ���� �ʿ�
						//close() �޼ҵ� �������̵� �ʿ�
						//try(resource) {} ���� ���
	@Override
	public void close() throws Exception {
		System.out.println("���ҽ��� close(), ���ŵǾ����ϴ�.");} 
	
	
}
