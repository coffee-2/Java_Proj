package basic_class_11.object;

public class Integer_Ex {
	
	
	public static void main(String[] args) {
		//Integer �� toString() �޼ҵ尡 ������ �Ǿ�����. ���� ����
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i1==i2);			//��ü�� �ּҸ� ��
		System.out.println(i1.equals(i2));  //��ü�� ���� ��
		
		
		Integer i3 = 300;
		Integer i4 = 300;
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		
		
	}///main
}//////class
