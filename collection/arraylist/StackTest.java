package collection.arraylist;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> astack = new ArrayList<String>();
	
	//Stack �ڷ� ������ ���� �Ҵ� : push
	public void push(String data) {astack.add(data);}
	
	//Stack �ڷ� �������� �� ������ : pop
	public String pop() {
		int len = astack.size();
		if(len==0) {
			System.out.println("������ ������ϴ�.");
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

public class StackTest {	//�ڷᱸ�� : �������� �� ���� ���� ���� ���µ�.

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
