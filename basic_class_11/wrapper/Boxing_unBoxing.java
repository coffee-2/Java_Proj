package basic_class_11.wrapper;

public class Boxing_unBoxing {

	public static void main(String[] args) {
		Integer num1 = new Integer(100);
		int num2 = 200;
		
		int sum = num1 + num2;  //num1 �ڵ����� ��ڽ�, num1.intValue()
		//int sum = num1.intValue() + num2;  *JAVA 5.0 ����
		
		Integer num3 = num2;   //���� �ڽ� : Integer.valueof(num2)�� �ڵ� ��ȯ
		//Integer num3 = Integer.valueOf(num2);  *JAVA 5.0 ����
		
		
	}///main
}//////class
