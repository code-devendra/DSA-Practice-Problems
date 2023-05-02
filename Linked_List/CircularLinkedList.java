import java.util.*;

public class CircularLinkedList {
	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
		}
	}

	static Node insertBegin(Node head, int x) {
		Node new_head = new Node(x);
		if(head == null) {
			new_head.next = new_head;
			return new_head;
		}else {
			new_head.next = head.next;
			head.next = new_head;
			int t = new_head.data;
			new_head.data = head.data;
			head.data = t;
			return head;
		}
		
	}

	static Node insertEnd(Node head, int x) {
		Node new_node = new Node(x);
		if(head == null) {
			new_node.next = new_node;
		}else {
			new_node.next = head.next;
			head.next = new_node;
			int t = new_node.data;
			new_node.data = head.data;
			head.data = t;
		}
		return new_node;
	}

	static Node removeBegin(Node head) {
		if(head == null || head.next == head)
			return null;
		head.data = head.next.data;
		head.next = head.next.next;
		return head;
	}

	static Node removeEnd(Node head) {
		if(head == null || head.next == head)
			return null;
		Node curr = head;
		while(curr.next.next != head) {
			curr = curr.next;
		}
		curr.next = head;
		return head;
	}

	static Node removeAtPos(Node head, int pos) {
		if(head == null)	return head;
		if(pos == 1){
			return removeBegin(head);
		}
		Node curr = head;
		for(int i = 1; i < pos-1; i++) {
			curr = curr.next;
		}

		curr.next = curr.next.next;
		return head;

	}

	static void printList(Node head) {
		if(head == null)	return;
		Node r = head;
		do{
			System.out.print(r.data + " ");
			r = r.next;
		}while(r != head);
		System.out.println();
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = head;

		printList(head);

		head = insertBegin(head,5);
		printList(head);

		head = insertEnd(head,40);
		printList(head);

		head = removeAtPos(head, 1);
		printList(head);

		head = removeBegin(head);
		printList(head);

		head = removeEnd(head);
		printList(head);
	}
}