import java.util.*;

public class LinkedList {

	static class Node {
		int data;
		Node next;

		Node(int x) {
        	data = x;
        	next = null;
    	}
	}

	public static Node push( Node head, int new_data) {
		Node new_node = new Node(new_data);

		new_node.next = head;
		return new_node;
	}

	public static Node insertAtPos(Node head, int pos, int new_data) {
		Node temp = new Node(new_data);
		if(head == null){
			if(pos == 1) {
				return temp;
			}else{
				return head;
			}
		}
		if(pos == 1){
			temp.next = head;
			return temp;
		}
		Node curr = head;
		for(int i = 1; i < pos - 1; i++) {
			curr = curr.next;
			if(curr == null){
				System.out.println("Position out of range");
                return head;
			}
		}
		temp.next = curr.next;
		curr.next = temp;
		return head;
	}

	public static Node append(Node head, int new_data) {
		Node new_node = new Node(new_data);

		if(head == null) {
			return new_node;
		}

		new_node.next = null;
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}

		last.next = new_node;
		return head;
	}

	public static Node pop(Node head) {
		if(head == null)	return null;
		return head.next;
	}

	public static Node delTail(Node head){
		if(head==null)return null;
        if(head.next==null)return null;
        Node curr=head;
        while(curr.next.next!=null)
            curr=curr.next;
        curr.next=null;
        return head;
	}

	public static int searchElem(Node head, int x){
		int pos=1;
        Node curr=head;
        while(curr!=null){
            if(curr.data==x)
                return pos;
            else{
                pos++;
                curr=curr.next;
            }
        }
        return -1;
	}

	public static Node reverse(Node head) {
		if(head == null || head.next == null)
			return head;
		Node prev = null, curr = head, next = curr;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static void printList(Node head) {
		Node n = head;
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}


	public static void main(String[] args) {
		Node head = null;

		head = append(head, 12);
		head = append(head, 29);
		head = append(head, 11);
		head = append(head, 23);
		head = append(head, 8);

		head = delTail(head);
		head = insertAtPos(head,5,7);
		printList(head);

		head = reverse(head);
		printList(head);

		System.out.println(searchElem(head,23));
	}
}