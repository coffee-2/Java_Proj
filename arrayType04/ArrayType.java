package arrayType04;

public class ArrayType {

	public static void main(String[] args) {
		
		
		//초기화
		//1]선언과 동시에 초기화
		int[] intArray = {10,20,30,40,50};
		for(int i=0;i<intArray.length;i++) {
			System.out.printf("intArray [%d]:%d%n",i,intArray[i]);}
		
		//2]선언 후 new연산자로 초기화
		int[] intArray2;
		intArray2=new int[] {10,20,30,40,50};
		intArray2[0]=65;
		for(int i=0;i<intArray2.length;i++) {
			System.out.printf("intArray2 [%d]:%d%n",i,intArray2[i]);}
		
		System.out.println("String 배열");
		String strArray[];
		strArray = new String[] {"박상준","박상혁","박광명"};
		for(int i=0;i<strArray.length;i++) {
			System.out.printf("strArray [%d]:%s%n",i,strArray[i]);}
		
		//다차원 배열]
		int [][] intnArray = {{10,20,30,40,50},{60,70,80,90,100}};
		for(int i=0;i<intnArray.length;i++) {
			for(int j=0;j<intnArray[i].length;j++) {
				System.out.printf("intnArray [%d][%d]:%d%n",i,j,intnArray[i][j]);}
		}
		
		//향상된 for문
		for(int[]j:intnArray) {
			for(int i:j) {System.out.printf("%d%n",i);}
		}
		
		
		
		
	}////main
}///////class
