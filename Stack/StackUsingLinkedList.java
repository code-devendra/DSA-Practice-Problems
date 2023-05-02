import java.util.*;


class Node {
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}

class MyStack {
	Node head;
	int size;
	MyStack() {
		head = null;
		size = 0;
	}
	public void push(int item) {
		Node temp = new Node(item);
		temp.next = head;
		head = temp;
		size++;
	}
	public int pop() {
		if(head == null)	return Integer.MAX_VALUE;
		int res = head.data;
		head = head.next;
		size--;
		return res;
	}
	public int peek() {
		if(head == null)	return Integer.MAX_VALUE;
		return head.data;
	}
	public boolean isEmpty() {
		return (head == null);
	}
	public int size(){
		return size;
	}

}

public class StackUsingLinkedList {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(5);
		stack.push(15);
		stack.push(25);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		stack.push(35);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
	}
}