package lamda_14.lamda.lab01;

public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		//1. ��ü �������� ��� - ��ü�� �޼ҵ�� ȣ��
		//���� Ŭ���� ����, ������ ����ϴ� �޼ҵ�
		StringConcatImpl c1 = new StringConcatImpl();
		c1.makeString(s1, s2);
		
		//2. ���ٽ��� ����Ͽ� ���
		//���� Ŭ���� ���� �۵�, �ӽ������� ���
		StringConcat c2 = (s, v) -> System.out.println(s+" "+v);
		c2.makeString(s1, s2);
		
		//3. �͸� ���� Ŭ������ ����� ���
		//���� Ŭ������ ���ο��� ����, �ӽ������� ���
		StringConcat c3 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+" "+s2);}
		};
		c3.makeString(s1, s2);
		
		
	}///main
}//////class
