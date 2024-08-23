package collectionframe;

import java.util.LinkedList;
import java.util.List;

public class LinkLi 
{
	public static void main(String[] args) {
		List<Integer> li = new LinkedList<>();
		
		li.add(11);
		li.add(22);
		li.add(33);
		
		li.remove(1);
		
		System.out.println(li);
	}
}
