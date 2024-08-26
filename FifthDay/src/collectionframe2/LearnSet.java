package collectionframe2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet 
{
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(33);
//		set.add(3);
		Iterator<Integer> ite = set.iterator();
		
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		
//		for(int e:set)
//		{
//			System.out.print(e + " ");
//		}
		System.out.println(set);
	}
}
