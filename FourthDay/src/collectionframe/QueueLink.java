package collectionframe;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLink 
{
	public static void main(String[] args) {
		Queue<Integer> li = new LinkedList<>();
		
		li.offer(11);
		li.offer(22);
		li.offer(33);
		
		System.out.println(li);
//		System.out.println(li.peek());
		System.out.println(li.poll());
		
		System.out.println(li);
		System.out.println(li.peek());
		
	}
}
