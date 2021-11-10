package object06.static_ex;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info = company + "-" + model;
	
	Television() {}
	
	static {info = company + "-" + model;}//초기화 블록
}
