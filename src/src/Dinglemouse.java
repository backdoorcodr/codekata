package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Dinglemouse {

	public static int[] convertIntegers(ArrayList<Integer> integers)
	{
	    int[] ret = new int[integers.size()];
	    for (int i=0; i < ret.length; i++)
	    {
	        ret[i] = integers.get(i).intValue();
	    }
	    
	    return ret;
	}
	
	public static int[] sort(final int array[]) {
	      // Your code here
		System.out.println(Arrays.toString(array));
		ArrayList<Integer> number = new ArrayList<>();
		for (int i: array) {
			number.add(i);
		}
		Collections.sort(number);
	    return convertIntegers(number);
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] i = new int[] {4, 1, 3, 2};
		
		System.out.println(Dinglemouse.sort(i)[0]);
	}

}
