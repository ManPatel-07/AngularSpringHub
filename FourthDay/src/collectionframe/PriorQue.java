package collectionframe;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorQue
{
	public static void main(String[] args) {
		Queue<Integer> qu = new PriorityQueue<>();
		
		qu.offer(44);
		qu.offer(11);
		qu.offer(33);
		qu.offer(22);
		
		System.out.println(qu);
		
		System.out.println(qu.peek());
	}
}
