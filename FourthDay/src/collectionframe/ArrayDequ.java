package collectionframe;

import java.util.ArrayDeque;

public class ArrayDequ 
{
	public static void main(String[] args) {
		ArrayDeque<String> li = new ArrayDeque<>();
		
		li.offer("abc");
		li.offerFirst("mno");
		li.offerLast("xyz");
		
		System.out.println(li);
		
		System.out.println(li.peekFirst());
		System.out.println(li.peekLast());

		li.pollLast();
		
		System.out.println(li);
	}
}
