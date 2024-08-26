package collectionframe2;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public class LearnArrayList
{
	public static void main(String[] args)
	{
		List li = new ArrayList<>();
		
		li.add(1);
		li.add(2);
		li.add("abc");

		System.out.println(li);
		
		Object[] arr = li.toArray();
		
		for(int i = 0; i <arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
