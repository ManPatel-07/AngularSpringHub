package collectionframe2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnHashMap
{
	public static void main(String[] args) {
		
		 HashMap<Integer, String> hm = new HashMap<Integer, String>();
		 
		 hm.put(1, "a");
		 hm.put(2, "b");
		 hm.put(3, "c");
		 
		 Set<Entry<Integer, String>> set = hm.entrySet();
		 
		 for(Map.Entry<Integer, String> me:set)
		 {
			 System.out.println(me.getValue());
			 System.out.println(me.getKey());
		 }
		 
		 String element = hm.get(Integer.valueOf(1));
		 hm.put(1, "zzz");
		 System.out.println(hm);
	}
}
