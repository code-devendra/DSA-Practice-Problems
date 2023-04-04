import java.util.*;

class MyChainHash {
	int BUCKET;
	ArrayList<LinkedList<Integer>> table;
	MyChainHash(int b) {
		BUCKET = b;
		table = new ArrayList<LinkedList<Integer>>();
		for(int i = 0; i < b; i++)
			table.add(new LinkedList<Integer>());
	}
	void insert(Integer k) {
		int i = k%BUCKET;
		table.get(i).add(k);
	}
	boolean search(Integer k){
		int i = k%BUCKET;
		return table.get(i).contains(k);
	}
	void delete(Integer k){
		int i = k%BUCKET;
		table.get(i).remove(k);
	}
}


public class Chaining{
	public static void main(String[] args){
		MyChainHash mh = new MyChainHash(7);
		mh.insert(10);
	    mh.insert(20);
	    mh.insert(15);
	    mh.insert(7);
	    System.out.println(mh.search(10));
	    mh.delete(15);
	    System.out.println(mh.search(15));
	}
}
