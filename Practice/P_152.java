package Practice;


public class P_152 {
	public static void main(String[] args) {
		
		int score[] = {83, 90, 87};
		int sum = 0;
		double avg = 0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];}
		avg = (double) sum/3;
		System.out.println("score[0]: " + score[0]);
		System.out.println("score[1]: " + score[1]);
		System.out.println("score[2]: " + score[2]);
		System.out.println("ÃÑÇÕ: " + sum);
		System.out.println("Æò±Õ: " + avg);
		
		
		
	}/////main
}////class
