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
		
		
		Stream<String> stream = slist.stream(); //컬렉션의 스트림 생성
		stream.forEach(s -> System.out.println(s+" ")); //한번 쓰면 삭제됨!
		//forEach() : 출력문
		
		System.out.println("---------------------------------");
		
		//두번째 스트림
		//정렬해서 출력
		slist.stream().sorted().forEach(s -> System.out.println(s+ " "));
		System.out.println("---------------------------------");
		
		//세번째 스트림
		//글자 수 출력
		slist.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
		System.out.println("---------------------------------");
		
		//네번째 스트림
		//글자 수가 4개 이상인 것만 출력
		slist.stream().filter(s -> s.length()>=4).forEach(s -> System.out.println(s));
		System.out.println("---------------------------------");
		
		/*
		System.out.println("ABCDEF의 바이트 수는 : a.length()");
		String a = "ABCDEF";
		System.out.println(a.length());
		*/
		
		
	}//main
}/////class
