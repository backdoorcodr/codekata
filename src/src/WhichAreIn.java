package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class WhichAreIn {

	public static String[] inArray(String[] array1, String[] array2) {
		 
		ArrayList<String> resultant_list = new ArrayList<>();
		
		for (int idx = 0; idx < array1.length; idx++) {
			
			String substring = array1[idx];
			
			for (int jdx = 0; jdx < array2.length; jdx++) {
				
				String word = array2[jdx];
				
				if (word.contains(substring))  {
					if (resultant_list.indexOf(substring) < 0)
					resultant_list.add(substring);
				}
			}
		}
		String[] arr = resultant_list.toArray(new String[resultant_list.size()]);
		Arrays.sort(arr);
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WhichAreIn o = new WhichAreIn();
		String[] array1 = {"1295", "code", "1346", "1028", "ar"};
		
		String[] array2 = {"12951295", "ode", "46", "10281066", "par"};
		
		o.inArray(array1, array2);
	}

}
