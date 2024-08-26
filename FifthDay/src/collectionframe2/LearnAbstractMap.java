package collectionframe2;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class LearnAbstractMap 
{
	public static void main(String[] args) {
		AbstractMap<Integer, String> m1 = new HashMap<Integer, String>();
		
		m1.put(1, "man");
		m1.put(2, "Kushal");
		m1.put(3, "Darshil");
		m1.put(7, "pappu");
		m1.put(5, "Motu");
		m1.put(10, "patlu");
		
		System.out.println(m1.put(3, "Armaan"));
		System.out.println(m1.entrySet());
		
		Set<Entry<Integer, String>> set = m1.entrySet();
		
		Iterator<Entry<Integer, String>> ite = set.iterator();
		
		while(ite.hasNext())
		{
			Entry<Integer, String>  element = ite.next();
			System.out.println(element.getValue());
			System.out.println(element.getKey());
			
			if(element.getKey().equals(Integer.valueOf(1)))
			{
				element.setValue("Divya");
			}
		}
		
		System.out.println(set);
	}
}
