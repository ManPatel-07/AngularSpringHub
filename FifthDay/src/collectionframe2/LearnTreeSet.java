package collectionframe2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet
{
	public static void main(String[] args)
	{
//		Set<Integer> set = new HashSet<>();
//		
//		set.add(1);
//		set.add(4);
//		set.add(2);
//		set.add(9);
//		set.add(6);
//		set.add(7);
//		set.add(23);
//		Set set2 = new TreeSet<>(set); 
//		System.out.println(set);
//		System.out.println(set2);
//		
//		System.out.println("A".compareTo("A"));
//		System.out.println("A".compareTo("B"));
//		System.out.println("z".compareTo("a"));
		
		Set<Integer> set2 = new TreeSet<Integer>(new MyComaprator());
		
		MyComaprator compare = new MyComaprator();
		
		set2.add(1);
		set2.add(4);
		set2.add(0);
		set2.add(3);
		
		System.out.println(set2);
		System.out.println(compare.compare(1, 2));
		System.out.println(Integer.valueOf(1).compareTo(2));

	}
}
