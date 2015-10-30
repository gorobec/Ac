package lesson16;

import java.util.LinkedList;

public class TestMLL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list = new MyLinkedList();
		list.addHead(10);
		list.addHead(15);
		list.print();
		System.out.println();
		list.addHead(8);
		list.addHead(15);
		list.addHead(6);
		list.print();
		System.out.println();
		list.addTail(5);
		list.addTail(3);
		list.print();
		System.out.println();
		list.removeNode(2);
		list.print();
		System.out.println();
		System.out.println(list.contains(8));
		
		LinkedList ll = new LinkedList();
		//inner
		MyLinkedList.Node node = list.new Node();
		//MyLinkedList.Node node2 = new MyLinkedList.new Node();
		//static
		//MyLinkedList.Node node3 = new MyLinkedList.Node();
	}

}
