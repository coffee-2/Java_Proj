package basic_class_11.object;

public class StringBuilderTest {
				//StringBuilder : 단일스레드 환경에서 대량으로 문자열 연결할 때 사용

	public static void main(String[] args) {
		String jstr = new String("Java");
		System.out.println("jstr 문자열 주소 - "+System.identityHashCode(jstr));
		
		StringBuilder buffer = new StringBuilder(jstr);
		System.out.println("연산 전 buffer 메모리 주소 - "+System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" Android");
		buffer.append(" program is fun!");
		System.out.println(buffer);
		System.out.println("연산 후 buffer 메모리 주소 - "+System.identityHashCode(buffer));
		
		jstr = buffer.toString();
		System.out.println(jstr);
		System.out.println("연결된 jstr 문자열 주소 - "+System.identityHashCode(jstr));
		
		
	}///main
}///////class
