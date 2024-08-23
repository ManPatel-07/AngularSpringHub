package collectionframe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Test 
{
	public static void main(String[] args) 
	{
		Set<Integer> set = new LinkedHashSet<>();
		Queue<String> que = new PriorityQueue<>();
		
		que.add("x");
		que.add("d");
		que.add("a");
		
		que.poll();
		System.out.println(que);
		System.out.println(que.peek());
		
		set.add(11);
		set.add(22);
		set.add(null);
		
		System.out.println(set);
		
		List<Integer> li = new ArrayList<>();
		
		li.addAll(set);
		
		System.out.println(li);
	}
}
