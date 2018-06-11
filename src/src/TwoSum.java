package src;

import java.util.Arrays;

public class TwoSum {
	
    public static int[] twoSum(final int[] numbers, int target)
    {
    	
    	// System.out.println(Arrays.stream(numbers).mapToLong(i -> i + numbers[0]).sum()); 
    	// an attempt can be proceeded by using streams
    	
        for (int i = 0; i < numbers.length; i++) {
        	
        	int result = 0;
        	int pivot = numbers [i];
        	for (int j = 0; j < numbers.length; j++) {
        		result = pivot + numbers[j];
        		if (result == target) {
        			return new int[] {i,j};
        		}
        	}
        }
		return new int[] {0,0};
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{1,2,3}, 4)));
		System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{1234, 5678, 9012}, 14690)));
		// System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{2,2,3}, 4)));
	}
    
}
