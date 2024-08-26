package collectionframe2;

import java.util.SortedMap;
import java.util.TreeMap;

public class LernSortedMap
{
	public static void main(String[] args) {
		SortedMap<Integer, String> m1 = new TreeMap<>();
		
		
		m1.put(1, "man");
		m1.put(2, "Kushal");
		m1.put(3, "Darshil");
		m1.put(7, "pappu");
		m1.put(5, "Motu");
		m1.put(10, "patlu");
		
		System.out.println(m1.firstKey());
		System.out.println("Sorted Map = "+ m1);
		System.out.println(m1.headMap(7));
		System.out.println(m1.tailMap(7));
		System.out.println(m1.subMap(3, 7));
	}
}
