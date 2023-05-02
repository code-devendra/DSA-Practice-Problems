import java.util.*;

class MyStack {
	int[] arr;
	int top;
	int capacity;
	MyStack(int capacity) {
		arr = new int[capacity];
		this.capacity = capacity;
		top = -1;
	}

	public void push(int item) {
		if(top == capacity-1)
			return;
		top++;
		arr[top] = item;
	}
	public int pop() {
		if(top == -1)
			return -1;
		int popItem = arr[top];
		top--;
		return popItem;
	}
	public int peek() {
		if(top == -1)
			return -1;
		return arr[top];
	}
	public boolean isEmpty() {
		if(top == -1)
			return true;
		return false;
	}
	public int size(){
		return top+1;
	}

}

public class StackUsingArray {
	public static void main(String[] args) {
		MyStack stack = new MyStack(5);
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