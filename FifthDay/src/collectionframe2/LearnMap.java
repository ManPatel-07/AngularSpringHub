package collectionframe2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap 
{
	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<>();
		
		m1.put(1, "a");
		m1.put(2, "b");
		m1.put(3, "c");
		m1.put(5, "d");
		m1.put(4, "e");
		
		System.out.println(m1);
		System.out.println(m1.containsKey(2));
//		m1.clear();
		System.out.println(m1.get(1));
//		System.out.println(m1);
		
		Set<Entry<Integer, String>> enSet = m1.entrySet();
		
		for(Map.Entry<Integer, String> m:enSet)
		{
			System.out.println("Entry Set : ");
			System.out.println(m);
		}
		
	}
}
