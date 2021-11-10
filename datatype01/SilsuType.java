package datatype01;

import java.math.BigDecimal;

public class SilsuType {

	public static void main(String[] args) {
		long ln = 100;
		float f1 = 200;
		
		float f2 = ln + f1;
		System.out.println(f2);
		
		float f3 = (float)3.14;
		
		f3 = 3.14F;
		System.out.println("f3=" + f3);
		
		float f4 = 300, f5 = 400, f6;
		f6 = f4 + f5;
		System.out.println(f6);
		
		double d1 = 10.0, d2;
		d2 = f4 + d1;
		System.out.println(d2);
		
		/*int ������ = 10;
		float ������2 = 100;
		double pi = 3.14;
		double ���Ǹ��� = ������2*pi;
		System.out.println("���Ǹ���=" + ���Ǹ���);
		
		int iarea;
		float farea;
		double darea;
		
		iarea = (int)(������*������*3.14);
		farea = (float)(������*������*3.14);
		darea = ������*������*3.14;
		System.out.println(iarea);
		System.out.println(farea);
		System.out.println(darea);
		*/
		
		//�ε��Ҽ� ��� �������
		double dl1 = 0.1;
		double dl2 = 0.2;
		System.out.println(dl1 + dl2);
		System.out.println(dl1*dl2);
		System.out.println(dl1 + dl2==0.3);
		//������ ����?! ������ ǥ���Ǵ� ���� 0�� ��Ÿ�� �� ���� ����!
		
		BigDecimal big1 = new BigDecimal("0.1");
		BigDecimal big2 = new BigDecimal("0.2");
		BigDecimal big3 = big1.add(big2);
		System.out.println("big3=" + big3);
		
		System.out.println(big3.compareTo(new BigDecimal("0.3")));
		
		
		
	}

}
