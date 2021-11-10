package lamda_14.lamda.lab03;

@FunctionalInterface
interface PrintString {void showString(String str);}


public class LamdaTest {
	
	public static void showMyString(PrintString p) {p.showString("Hello Lamda");}
	
	public static PrintString returnString() {
		return s -> System.out.println(s); }
	
	public static void main(String[] args) {
		
		//1. ���ٽ��� ������ ����
		PrintString str1 = s -> System.out.println(s);
		str1.showString("Black Lamda~!!");
		System.out.println("---------------");
		
		//2. �Ű������� ����
		showMyString(str1);
		//showMyString(s -> System.out.println(s));
		System.out.println("---------------");
		
		//3. ���� ������ ���ٽ��� ���
		PrintString restr = returnString();
		restr.showString("Hello World");
		
		
	}///main	
}/////class
