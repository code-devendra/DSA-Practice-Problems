import java.util.*;
public class Hash_Set {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<>();
		h.add("GfG");
		h.add("DSA");
		h.add("Course");

		System.out.println(h.size());
		System.out.println(h);

		System.out.println(h.contains("DSA"));

		Iterator<String> i = h.iterator();
		while(i.hasNext()){
			System.out.print(i.next() + " ");
		}

		h.remove("DSA");
		System.out.println("\n" + h.size());

		for(String s : h)
			System.out.print(s + " ");

		h.clear();
		System.out.println("\nis hashset empty : "+ h.isEmpty());

	}
}