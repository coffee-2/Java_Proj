package controlStatement03;

public class CountinueStatement {

	public static void main(String[] args) {
		int num=0;
		int sum=0;
		for(num=0;num<=100;num++) {
			if(num%2!=0)
			sum+=num;}
		System.out.println("Ȧ�� ��:"+sum);
		
		
		num=0;
		sum=0;
		for(num=0;num<=100;num++) {
			if(num%2==0) continue;
			sum+=num;}
		System.out.println("Ȧ�� ��:"+sum);
		
		
		
		while(num<=100) {
			if(num%2!=0) continue;
			sum+=num; num++;}
		System.out.printf("¦�� ��:"+sum);
		
		
		
		
		
		
		
	}///main
}//////class
