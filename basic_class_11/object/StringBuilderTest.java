package basic_class_11.object;

public class StringBuilderTest {
				//StringBuilder : ���Ͻ����� ȯ�濡�� �뷮���� ���ڿ� ������ �� ���

	public static void main(String[] args) {
		String jstr = new String("Java");
		System.out.println("jstr ���ڿ� �ּ� - "+System.identityHashCode(jstr));
		
		StringBuilder buffer = new StringBuilder(jstr);
		System.out.println("���� �� buffer �޸� �ּ� - "+System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" Android");
		buffer.append(" program is fun!");
		System.out.println(buffer);
		System.out.println("���� �� buffer �޸� �ּ� - "+System.identityHashCode(buffer));
		
		jstr = buffer.toString();
		System.out.println(jstr);
		System.out.println("����� jstr ���ڿ� �ּ� - "+System.identityHashCode(jstr));
		
		
	}///main
}///////class
