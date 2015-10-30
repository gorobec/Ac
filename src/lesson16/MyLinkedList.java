package lesson16;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class MyLinkedList {
	Node tail;
	
	public void addHead(int value) {
		Node newNode = new Node (value, null);
		if (tail == null) {
			tail = newNode;
			return;
		}
		Node tmp = tail;
		while (tmp.next != null) {			
			tmp = tmp.next;
		}
		
		tmp.next = newNode;
	}
	
	public void addTail(int value) {
		Node newNode = new Node (value, null);
		if (tail == null) {
			tail = newNode;
			return;
		}
		
		Node newNod = new Node (value, tail);
			tail = newNod;
		
	}
	
	public void removeNode (int index) {
		Node node = tail;
		
		while (index-- > 1) {
			node = node.next;
		}
		node.next = node.next.next;
		
		
	}
	
	
	public boolean contains (Object o) {
		Node findNode = new Node((Integer) o, null);
		
		Node tmp = tail;
		while (tmp.next != null) {	
			if (tmp.equals(findNode))
				return true;
			
			tmp = tmp.next;
		}
		return false;
		
	}
	public void print() {
		Node tmp = tail;
		while (tmp != null) {
			System.out.print(tmp.value + "->");
			tmp = tmp.next;
		}
	}
	
	
	public void swap (int indexFirst, int indexLast) {
		Node nodeLeft1 = tail;
		while (indexFirst-- > -1) {
			nodeLeft1 = nodeLeft1.next;
		}
		
		Node nodeRight1= tail;
		while (indexFirst-- > -1) {
			nodeLeft1 = nodeRight1.next;
		}
		
		Node nodeLeft2 = tail;
		while (indexLast-- > -1) {
			nodeLeft1 = nodeLeft2.next;
		}
		
		Node nodeRight2= tail;
		while (indexLast-- > -1) {
			nodeLeft2 = nodeRight2.next;
		}
	}
	
	class Node {
		private int value;
		private Node next;
		
		
		/**
		 * @return the value
		 */
		public int getValue() {
			return value;
		}

		/**
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;			
		}
		
		public Node() {
			// TODO Auto-generated constructor stub
		}

		public boolean equals(Object o) {

			if (this == o)
				return true;
			
			if (o == null)
				return false;
			
			if (getClass() != o.getClass())
				return false;
			
			  Node node  = (Node) o;
			  
			  if (value != node.value)
				  return false;
			  
			 /* if (next != getNext())
				  return false;*/
			  
			  return true;
			  
			  
			
		}
		
		
	}

}
