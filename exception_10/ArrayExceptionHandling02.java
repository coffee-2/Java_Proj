package exception_10;

public class ArrayExceptionHandling02 {

	public static void main(String[] args) {
		//try���� ���ܰ� �߻��Ǹ� catch ����� �۵� ��
		int arr[]  = new int[5];
		
		try {
			for(int i=0; i<5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);	//�����ڵ� ���
			System.out.println("����ó�� �κ�");}
		
		System.out.println("���α׷� ���� ����");
		
			/*
			try {
				���ܰ� �߻��� �κ�
			}
			catch(Exception�ڵ� e) {���� ó�� �κ�, try������ ���ܰ� �߻��Ǹ� �۵�}
			*/
		
		
		
	}/////main
}////////class
