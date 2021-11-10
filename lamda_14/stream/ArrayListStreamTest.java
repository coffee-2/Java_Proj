package lamda_14.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> slist = new ArrayList<String>();
		
		slist.add("Tom");
		slist.add("Eddy");
		slist.add("Jack");
		
		for(int i=0; i<slist.size(); i++) {
			String s = slist.get(i);
			System.out.println(s);}
		System.out.println("---------------------------------");
		
		
		Stream<String> stream = slist.stream(); //�÷����� ��Ʈ�� ����
		stream.forEach(s -> System.out.println(s+" ")); //�ѹ� ���� ������!
		//forEach() : ��¹�
		
		System.out.println("---------------------------------");
		
		//�ι�° ��Ʈ��
		//�����ؼ� ���
		slist.stream().sorted().forEach(s -> System.out.println(s+ " "));
		System.out.println("---------------------------------");
		
		//����° ��Ʈ��
		//���� �� ���
		slist.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
		System.out.println("---------------------------------");
		
		//�׹�° ��Ʈ��
		//���� ���� 4�� �̻��� �͸� ���
		slist.stream().filter(s -> s.length()>=4).forEach(s -> System.out.println(s));
		System.out.println("---------------------------------");
		
		/*
		System.out.println("ABCDEF�� ����Ʈ ���� : a.length()");
		String a = "ABCDEF";
		System.out.println(a.length());
		*/
		
		
	}//main
}/////class
