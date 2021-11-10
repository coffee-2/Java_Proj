package array_05.twodimension;

public class ScoreAvg {

	public static void main(String[] args) {
		double score[][] = {{3.3, 3.4},{3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		double sum = 0;
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];}
			}
		int n  =score.length;
		int m = score[0].length;
		double avg = sum/(n*m);
		
		System.out.println("4학년 전체 합 : " + sum);
		
		System.out.println("4학년 전체 평균 : " + avg);
		
		
		
	}////main
}/////class
