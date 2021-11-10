package controlStatement03;

public class ForStatement {
	public static void main(String[] args) {
		int sum =0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지 누적합: " + sum);
		
		//1부터 10까지 2의 배수의 합
		sum =0;
		for(int i=0; i<=10; i+=2) {
			sum +=i;
		}
		System.out.println("1부터 10까지 2의 배수의 합: " + sum);
		
		sum=0;
		for(int i=0; i<=10; i++) {
			if(i%2==0) sum+=i;
		}
		System.out.println("1부터 10까지 2의 배수의 합: " + sum);
		
		//for 블록 밖에서 i를 초기식으로 사용
		int i =1;
		for(;i<=10;i++) {}
		System.out.println("for문이 끝난 후 i값: " + i);
		
		
		//1부터 100까지 3의 배수이거나 5의 배수인 숫자의 합 구하기
		sum=0;
		for(int e=1; e<=100; e++) {
			if(e%3==0 || e%5==0) sum+=e;
			}
		System.out.println("1부터 100까지 3의 배수이거나 5의 배수인 숫자의 합:" + sum);
		
		//|| 하고 && 연산자 사용
		sum=0;
		for(int e=1; e<=100; e++) {
			if((e%3==0 || e%5==0) && e%15!=0 ) sum+=e;
			}
		System.out.println("1부터 100까지 3의 배수이거나 5의 배수인 숫자의 합(공배수 제외):" + sum);
		
		//^연산자 사용(true^false=true)
		sum=0;
		for(int e=1; e<=100; e++) {
			if(e%3==0 ^ e%5==0 ) sum+=e;
			}
		System.out.println("1부터 100까지 3의 배수이거나 5의 배수인 숫자의 합(공배수 제외):" + sum);
		
		
		int h=0;
		for(int j=1;j<5;j++) {
			for(int k=1;k<5;k++) {
				if (j+k==5) {
					System.out.printf("1 ");
					h=k;}
				else System.out.printf("0 ");}
			System.out.println();}
		
		
		
		
		for(int j=1;j<6;j++) {
			for(int k=1;k<6;k++) {
				if(j>=k) System.out.printf("* ");
				else System.out.printf("  ");}
			System.out.println();}

		for(int j=1;j<6;j++) {
			for(int k=1;k<6;k++) {
				if(k+j>=6) System.out.printf("%2c",'*');
				else System.out.printf("%2c",' ');}
			System.out.println();}
		
		System.out.printf("%n%n구구단을 외자%n");
		for(int j=2;j<=9;j++) {
			for(int k=1;k<=9;k++) {
				System.out.printf("%d*%d=%d  ",j,k,j*k);
			}
			System.out.println();
		}
		
		
		
		
	

		
		
		
		
	}//main
}//////class
