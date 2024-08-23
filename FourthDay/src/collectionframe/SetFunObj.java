package collectionframe;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetFunObj 
{
	public static void main(String[] args) {
		Set<Student> set = new LinkedHashSet<>();
		
		set.add(new Student("Abc", 101));
		set.add(new Student("pqr", 102));
		set.add(new Student("xyz", 103));
		set.add(new Student("mno", 102));
		
		System.out.println(set);
		
	}
}
