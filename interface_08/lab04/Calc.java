package interface_08.lab04;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int x, int y);
	int sub(int x, int y);
	int times(int x, int y);
	double div(int x, int y);
	
	default void description() {System.out.println("���� ����");}
	
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) {total += i;}
		return total;}
	
	//private void myMethod() {System.out.println("Private �޼ҵ� �Դϴ�.");}
	
	//private static void myStaticMethod() {
		//System.out.println("Private static �޼ҵ�");}
	
	
	
	
	
}
