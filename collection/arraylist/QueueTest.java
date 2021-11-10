package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> aQueue = new ArrayList<String>();
	
	public void enQueue(String data) {aQueue.add(data);}
	
	public String deQueue() {
		int len = aQueue.size();
		if(len==0) {
			System.out.println("ť�� ������ϴ�.");
			return null;}
		return (aQueue.remove(0));		//index 0�� �� ����
	}
	
	public void showAll() {
		for(int i=0; i<aQueue.size(); i++) {
			System.out.println(aQueue.get(i)+" index "+i);
		}
	}
	
}

public class QueueTest {	//���� �� ���� ���� ���� ��µ�.

	public static void main(String[] args) {
		
		MyQueue q = new MyQueue();
		
		q.enQueue("A");
		q.enQueue("B");
		q.enQueue("C");
		q.enQueue("D");
		
		q.showAll();
		System.out.println("=============");
		
		System.out.println(q.deQueue());
		q.showAll();
		System.out.println("=============");
		
		System.out.println(q.deQueue());
		q.showAll();
		System.out.println("=============");
		
		System.out.println(q.deQueue());
		q.showAll();
		System.out.println("=============");
		
		
	}//main
}////class
