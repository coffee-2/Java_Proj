package basic_class_11.garbage_coollector;

public class Counter {
		//Garbage Collector(������ �÷���) : �޸��� ������� �ʴ� ��ü ���� û��. System.gc();
		//�ڹٴ� JVM�� �ڵ����� û������
	//finalize() �޼ҵ� : ������ �÷��Ͱ� û���ϱ� ���� ȣ��Ǵ� �޼ҵ�
		//��ü �Ҹ� ������ ȣ��Ǵ� �޼ҵ�
	
	private int no;
	public Counter(int no) {this.no = no;}
	
	@Override
	protected void finalize() throws Throwable { //��ü�� ������ �� ȣ��Ǵ� �޼ҵ�
		System.out.println(no+"��°�� finalize() �� �����(��ü �Ҹ��)");}
			
	
}
