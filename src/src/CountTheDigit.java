package src;

import java.util.ArrayList;

public class CountTheDigit {

    public static int nbDig(int n, int d) {
        // your code
    	char digit = (char) (d + '0');
    	int count = 0;
    	
    	ArrayList<Integer> integers = new ArrayList<Integer>();
    	if (n >= 0) {
    		for (int i = 0; i<=n; i++) {
    			integers.add(i*i);
    		}
    	}
    	for (int number : integers) {
    		String eachNumber = new Integer(number).toString();
    		for (int idx=0; idx < eachNumber.length(); idx++) {
    			if (eachNumber.charAt(idx) == digit) {
    				count++;
    			}
    		}
    	}
    	
    	System.out.println(count);
    	
    	return count;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountTheDigit.nbDig(5750, 0);
	}
    
}
