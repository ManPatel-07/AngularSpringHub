package collectionframe2;

import java.util.Comparator;

public class MyComaprator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2)
		{
			return o2-o1;
		}
		else if(o1>o2)
		{
			return o2-o1;
		}
		else {
			return 0;
		}
	}

}
