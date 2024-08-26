package collectionframe2;

import java.util.Stack;

public class LearnStack 
{
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();

		s1.push(1);
		s1.push(2);
		s1.push(32);
			
		int element = s1.search(32);
		System.out.println(element);
		
	}
}
