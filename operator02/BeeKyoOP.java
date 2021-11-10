package operator02;

	

	public class BeeKyoOP {

		public static void main(String[] args) {
			int num1=10, num2=20;
			System.out.println(num1!=num2);
			System.out.println(num1+20==num2+10);
			
			System.out.println(10.0d == 10.0f);//Âü
			System.out.println(0.1d == 0.1f);//°ÅÁş
			
			double d=(double)0.1f;
			System.out.println(d);
			float f1=(float)0.1f;
			System.out.println(f1);
			
			boolean b =!true || true ^ false && true;
			System.out.println(b);
			
			System.out.println('A'<'B');
			
		}

	}
