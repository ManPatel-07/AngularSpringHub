package collectionframe;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFunctionality 
{
	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<>();
		
//		Set<Integer> set = new LinkedHashSet<>();
		
		Set<Integer> set = new TreeSet<>();
		
		
		set.add(40);
		set.add(12);
		set.add(4);
		set.add(67);
		set.add(4);
		
		System.out.println(set);
		
		set.remove(12);
		
		System.out.println(set);
		System.out.println(set.contains(40));
		
	}
}
