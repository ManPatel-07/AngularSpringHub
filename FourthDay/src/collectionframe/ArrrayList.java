package collectionframe;

import java.util.ArrayList;

public class ArrrayList {

	public static void main(String[] args)
	{
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		ArrayList arr3 = new ArrayList<>();
		ArrayList<Integer> arr4 = new ArrayList<>();
		
		arr1.add(11);
		arr1.add(22);
		arr1.add(null);
		arr1.add(5);
		arr1.remove(null);
		arr1.remove(Integer.valueOf(11));
		
		arr2.add(2);
		arr2.set(0, arr1.get(0));
		
		arr3.add(1);
		arr3.add("Man patel");
		
		arr4.add(1);
		arr4.add(2);
		arr4.add(3);
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(arr4);

	}

}
