package controlStatement03;

public class ForStatement {
	public static void main(String[] args) {
		int sum =0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1���� 10���� ������: " + sum);
		
		//1���� 10���� 2�� ����� ��
		sum =0;
		for(int i=0; i<=10; i+=2) {
			sum +=i;
		}
		System.out.println("1���� 10���� 2�� ����� ��: " + sum);
		
		sum=0;
		for(int i=0; i<=10; i++) {
			if(i%2==0) sum+=i;
		}
		System.out.println("1���� 10���� 2�� ����� ��: " + sum);
		
		//for ��� �ۿ��� i�� �ʱ������ ���
		int i =1;
		for(;i<=10;i++) {}
		System.out.println("for���� ���� �� i��: " + i);
		
		
		//1���� 100���� 3�� ����̰ų� 5�� ����� ������ �� ���ϱ�
		sum=0;
		for(int e=1; e<=100; e++) {
			if(e%3==0 || e%5==0) sum+=e;
			}
		System.out.println("1���� 100���� 3�� ����̰ų� 5�� ����� ������ ��:" + sum);
		
		//|| �ϰ� && ������ ���
		sum=0;
		for(int e=1; e<=100; e++) {
			if((e%3==0 || e%5==0) && e%15!=0 ) sum+=e;
			}
		System.out.println("1���� 100���� 3�� ����̰ų� 5�� ����� ������ ��(����� ����):" + sum);
		
		//^������ ���(true^false=true)
		sum=0;
		for(int e=1; e<=100; e++) {
			if(e%3==0 ^ e%5==0 ) sum+=e;
			}
		System.out.println("1���� 100���� 3�� ����̰ų� 5�� ����� ������ ��(����� ����):" + sum);
		
		
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
		
		System.out.printf("%n%n�������� ����%n");
		for(int j=2;j<=9;j++) {
			for(int k=1;k<=9;k++) {
				System.out.printf("%d*%d=%d  ",j,k,j*k);
			}
			System.out.println();
		}
		
		
		
		
	

		
		
		
		
	}//main
}//////class
