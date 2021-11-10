package datatype01;

public class VariableDeclaration {
	public static void main(String[] args) {
		System.out.println("[변수 선언 방법 첫 번째]");
		//자료형(data type)변수명
		int num;//int형(숫자-정수) 저장할 수 있는 num이라는 이름의 메모리를 할당해주세요.
		num = 10;//변수 초기화
		
		int bNum = 0B1010;//2진수
		int cNum = 012;//8진수
		int dNum = 0xA;//16진수
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(cNum);
		System.out.println(dNum);
		
		System.out.println("[변수 선언 방법 두 번째]");
		int initNUm = 200;//선언과 동시에 
		System.out.println(initNUm);
		
		System.out.println("[변수 선언 방법 세 번째-동시에 같은 타입의 변수 여러개 선언하기]");
		int fnum,snum=300,tnum;
		fnum = snum;
		
		System.out.println(fnum);
		
		//fnum = snum + tnum;
		tnum = 500;
		System.out.println(snum+tnum);
		
	}
}
