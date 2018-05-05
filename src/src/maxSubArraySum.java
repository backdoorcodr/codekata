package src;

public class maxSubArraySum {

	
	 public static int sequence(int[] arr) {
	        int max_ending_here = 0, max_so_far = 0;
	        for (int v : arr) {
	            max_ending_here = Math.max(0, max_ending_here + v);
	            max_so_far = Math.max(max_so_far, max_ending_here);
	        }
	        return max_so_far;
	    }
	 
	static int maxSubArraySumFunc(int arr[])
    {
		
		if (arr.length == 0) return 0;
        int size = arr.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		maxSubArraySum o = new maxSubArraySum();
		System.out.println(o.maxSubArraySumFunc(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
		
	}

}
