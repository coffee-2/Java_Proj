package basic_class_11.object;

public class String_Ex02 { //concat() : �� ���ڿ��� �����ؼ� ���. �������� �߻�
						   //���� ���� ���ڿ��� ������ �� ���.

	public static void main(String[] args) {
		
		String jStr = new String("Java ");
		String aStr = new String("Android");
		
		System.out.println(jStr);
		System.out.println("ó�� ���ڿ� �ּ� ��-"+System.identityHashCode(jStr));
		System.out.println();
		
		jStr = jStr.concat(aStr);
		System.out.println(jStr);
		System.out.println("����� ���ڿ� �ּ� ��-"+System.identityHashCode(jStr));
		
		
	}////main
}///////class
