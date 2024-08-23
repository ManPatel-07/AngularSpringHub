package collectionframe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollections
{
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		
		li.add(11);
		li.add(22);
		li.add(33);
		li.add(44);
		li.add(55);
		li.add(66);
		
		Collections.sort(li, Comparator.reverseOrder());
		System.out.println(li);
	}
}
