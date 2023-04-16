import java.util.*;

public class DoublyLinkedList {
	static class Node {
		int data;
		Node prev;
		Node next;
		Node(int x) {
			data = x;
		}
	}

	static Node insertBegin(Node head, int d) {
		Node new_head = new Node(d);

		new_head.next = head;
		if(head != null) head.prev = new_head;
		return new_head;
	}

	static Node insertEnd(Node head, int d) {
		Node new_node = new Node(d);
		if(head == null)	return new_node;
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = new_node;
		new_node.prev = curr;
		return head;
	}

	static Node removeBegin(Node head) {
		if(head == null || head.next == null)	return null;
		head = head.next;
		head.prev = null;
		return head;
	}

	static Node removeEnd(Node head) {
		if(head == null || head.next == null)	return null;
		Node curr = head;
		while(curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
		return head;
	}

	static Node reverse(Node head) {
		if(head == null || head.next == null)	return head;
		Node curr = head;
		Node temp = null;
		while(curr != null) {
			temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			curr = curr.prev;
		}
		return temp.prev;

	}

	static void printList(Node head) {
		if(head == null) return;
		System.out.print("null <--> ");
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + " <--> ");
			curr = curr.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		Node head = null;

		head = insertEnd(head,1);
		head = insertEnd(head,2);
		head = insertEnd(head,3);
		head = insertEnd(head,4);

		head = insertBegin(head,0);

		printList(head);

		head = removeBegin(head);
		head = removeEnd(head);

		printList(head);

	}
}