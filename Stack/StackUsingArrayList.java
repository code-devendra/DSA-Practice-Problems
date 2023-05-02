import java.util.*;

class MyStack {
	ArrayList<Integer> al = new ArrayList<>();

	public void push(int item) {
		al.add(item);
	}
	public int pop() {
		if(al.isEmpty())	return Integer.MAX_VALUE;
		int popItem = al.get(al.size() - 1);
		al.remove(al.size() - 1);
		return popItem;
	}
	public int peek() {
		if(al.isEmpty())	return Integer.MAX_VALUE;
		return al.get(al.size()-1);
	}
	public boolean isEmpty() {
		return al.isEmpty();
	}
	public int size(){
		return al.size();
	}

}

public class StackUsingArrayList {
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