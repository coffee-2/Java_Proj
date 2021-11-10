package controlStatement03;

public class DoWhileStatement {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		do {sum+=i;
			i++;}while(i<=10);
		System.out.println(sum);
		
		i=1;
		do {int j=1;
			do {
				if(i==j) System.out.printf("%2d",1);
				else System.out.printf("%2d",0); j++;
			}while(j<5);
			i++; System.out.println();
		}while(i<5);
		
		i=1;
		do {int j=1;
			do {if(i>=j)System.out.printf("* ");
			else System.out.printf("  "); j++;}while(j<6);
		i++; System.out.println();
		}while(i<6);
		
		
		System.out.printf("구구단을 외자!%n");
		i=2;
		do {int j=1;
			do {System.out.printf("%d*%d=%d\t",i,j,i*j); j++;}while(j<10);
		i++;System.out.println();
		}while(i<10);

		
		
		
	}////main
}///////class
