package basic_class_11.garbage_coollector;

public class Counter {
		//Garbage Collector(가비지 컬렉터) : 메모리의 사용하지 않는 객체 정보 청소. System.gc();
		//자바는 JVM이 자동으로 청소해줌
	//finalize() 메소드 : 가비지 컬렉터가 청소하기 전에 호출되는 메소드
		//객체 소멸 직전에 호출되는 메소드
	
	private int no;
	public Counter(int no) {this.no = no;}
	
	@Override
	protected void finalize() throws Throwable { //객체가 삭제될 때 호출되는 메소드
		System.out.println(no+"번째의 finalize() 가 실행됨(객체 소멸됨)");}
			
	
}
