package collectionframe;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class LearnSoretedSet 
{
	public static void main(String[] args) 
	{
		SortedSet<Integer> set = new TreeSet<>();
		
		set.add(22);
		set.add(43);
		set.add(21);
		
		System.out.println(set);

		Object[] arr = set.toArray();
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		System.out.println(set.first());
	}
}
