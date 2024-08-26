package collectionframe2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class LearnLinkedList
{
	public static void main(String[] args) {
		LinkedList<Integer> linkLi = new LinkedList<>();
		
		linkLi.add(1);
	
		linkLi.addFirst(null);
		linkLi.offerFirst(77);
		linkLi.addLast(2);
//		linkLi.pollLast();
//		linkLi.pollFirst();
		linkLi.add(23);
		linkLi.add(32);
		linkLi.set(2, 88);
//		
//		ListIterator<Integer> liIte = linkLi.listIterator();
//	
//		while(liIte.hasPrevious())
//		{
//			System.out.println(liIte.previous());
//		}
//		
		System.out.println(linkLi.peek());
		System.out.println(linkLi);
		
		
		System.out.println(linkLi.getFirst());
	}
}
