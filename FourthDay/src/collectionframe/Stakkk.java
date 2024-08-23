package collectionframe;

import java.util.Stack;

public class Stakkk 
{
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		s.push(11);
		s.push(22);
		s.push(33);
		
		System.out.println(s);
		System.out.println(s.peek());
		
		s.pop();
		System.out.println(s.peek());
	}
}
