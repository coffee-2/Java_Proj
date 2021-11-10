package Practice;

public class P_158 {

	public static void main(String[] args) {
		int[] score = {83,90,87};
		int sum = 0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];}
		double avg = (double) sum/score.length;
		
		System.out.println("ÃÑÇÕ : " + sum);
		System.out.println("Æò±Õ : " + avg);
		
	}///main
}////class
