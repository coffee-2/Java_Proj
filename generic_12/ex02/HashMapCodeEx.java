package generic_12.ex02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapCodeEx {

	public static void main(String[] args) {
		
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		javaScore.put("Ȳ����", 100);
		javaScore.put("ö����", 89);
		javaScore.put("���ñ�", 90);
		javaScore.put("��ö��", 87);
		javaScore.put("������", 92);
		
		System.out.println("HashMap�� ����� ��� ���� : "+javaScore.size());
		
		Set<String> keys = javaScore.keySet();
		
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name+" "+score);}
		
		
	}//main
}////class
