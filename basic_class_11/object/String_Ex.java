package basic_class_11.object;

public class String_Ex {

	public static void main(String[] args) {
		//String, Integer, boolean �� toString() �޼ҵ尡 ������ �Ǿ� ����.
		//String, Integer, boolean �� equals() �޼ҵ尡 ������ �Ǿ� ����.
		
		
		//String�� ��üȭ �ؼ� ��ü ������ ����
		String str1 = new String("���̹�");
		String str2 = new String("���̹�");
		System.out.println(str1);
		//System.out.println(str2);
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		
		//String�� ��üȭ ���� �ʰ� ������ ����
		String str3 = "�ֵ���";
		String str4 = "�ֵ���";
		System.out.println(str3);
		//System.out.println(str4);
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		
	}///main
}////class
