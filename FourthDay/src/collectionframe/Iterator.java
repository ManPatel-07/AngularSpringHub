package collectionframe;

import java.util.ArrayList;
import java.util.List;

public class Iterator
{
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		
		for(int i = 0; i < 10; i++)
		{
			li.add(i+10);
		}
		
		java.util.Iterator<Integer> it = li.iterator();
		
		System.out.println(it.next());
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		for(Integer element:li)
		{
			System.out.println(element);
		}
	}
}
