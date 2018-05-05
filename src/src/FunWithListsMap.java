package src;

import java.util.Map;
import java.util.function.Function;

public class FunWithListsMap {

	static <T, R> Node<R> map(Node<T> head, Function<T, R> f) {
		
		Node<R> newList = null;
		System.out.println(head.data);
		newList = new Node(f.apply(head.data), head.next);
		while (head.next != null) {
			head = head.next;
			System.out.println(head.data);
		}
		
		return newList;
	 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Function<Integer, Integer> f = x -> x * 2;
		 Node list = new Node(1, new Node(2, new Node(3)));		 
		 FunWithListsMap.map(list, f);

	}
}

class Node<T> {
	  public T data;
	  public Node<T> next;

	  Node(T data, Node next) {
	    this.data = data;
	    this.next = next;
	  }

	  Node(T data) {
	    this(data, null);
	  }
	}