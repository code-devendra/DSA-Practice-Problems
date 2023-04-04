import java.util.*;
public class Hash_Map {
	public static void main(String[] args) {
		HashMap<String,Integer> m = new HashMap<>();
		m.put("GfG",10);
		m.put("DSA",15);
		m.put("Course",20);

		System.out.println(m);

		System.out.println("HashMap size : " + m.size());

		if(m.containsKey("DSA"))
			System.out.println("Yes");
		else 
			System.out.println("No");

		m.remove("DSA");
		System.out.println("HashMap size : " + m.size());

		if(m.containsValue(20))
			System.out.println("Yes");
		else 
			System.out.println("No");

		System.out.println(m.get("Course"));

		for(Map.Entry<String,Integer> i : m.entrySet())
			System.out.println(i.getKey() + " " + i.getValue());
	}
}