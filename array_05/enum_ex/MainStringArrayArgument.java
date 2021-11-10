package array_05.enum_ex;

public class MainStringArrayArgument {  //main() 메소드에 args 인자로 값을 넣어 주는 것

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			//System.out.println("Java MainStringArray n1 n2");
			System.out.println("반드시 정수값 2개를 arg 인자로 입력하세요. 예) 10 20");
			System.exit(0);} //프로그램 강제 종료
		
		String num1 = args[0];
		String num2 = args[1];
		System.out.println(num1 + num2); //3070으로 출력됨
		
		int n1 = Integer.parseInt(num1); //정수형으로 타입 변환
		int n2 = Integer.parseInt(num2);
		
		int result = n1 + n2;
		System.out.println("n1 + n2 = " + result);
		
		Integer aa = 10;
		System.out.println(num1.getClass().getSimpleName());
		System.out.println(num1.getClass().getName());
		System.out.println(aa.getClass().getName());
		
		
	}/////main
}////////class
