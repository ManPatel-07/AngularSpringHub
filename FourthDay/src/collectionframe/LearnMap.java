package collectionframe;

import java.util.HashMap;
import java.util.Map;

public class LearnMap
{
	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<>();
		
		m1.put(101, "abc");
		m1.put(102, "xyz");
		
		System.out.println(m1);
		
		for(Map.Entry<Integer, String> e:m1.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}
}
