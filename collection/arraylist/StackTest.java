package collection.arraylist;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> astack = new ArrayList<String>();
	
	//Stack 자료 구조에 값을 할당 : push
	public void push(String data) {astack.add(data);}
	
	//Stack 자료 구조에서 값 빼오기 : pop
	public String pop() {
		int len = astack.size();
		if(len==0) {
			System.out.println("스택이 비었습니다.");
			return null;}
		return (astack.remove(len - 1));
	}
	
	public void showAll() {
		for(int i=0; i<astack.size(); i++) {
			String a = astack.get(i);
			System.out.println(a+" index "+i);
			//System.out.println(astack.get(i)+" index "+i);
		}
	}
	
}

public class StackTest {	//자료구조 : 마지막에 들어간 값이 제일 먼저 츨력됨.

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		stack.showAll();
		System.out.println("=============");
		
		System.out.println(stack.pop());
		stack.showAll();
		System.out.println("=============");
		
		System.out.println(stack.pop());
		stack.showAll();
		System.out.println("=============");
		
		System.out.println(stack.pop());
		stack.showAll();
		System.out.println("=============");
		
		
	}/////main
}////////class
