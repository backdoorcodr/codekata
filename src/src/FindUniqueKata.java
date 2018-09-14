package src;

import java.util.TreeMap;

/***
 * Unfinished work 
 * 
 * @author muza270021
 *
 */
public class FindUniqueKata {
	
	
    public static double findUniq(double arr[]) {
    	TreeMap<Double, Integer> numbers = new TreeMap<Double, Integer>();
    	
    	if (arr.length > 3) {
        	
        	for (double n : arr) {
        		int counter = 0;
        		if (numbers.containsKey(n)) {
        			counter = numbers.get(n) + 1 ;
        			numbers.put(n, counter);
        		} 
        		else {
        			numbers.put(n, counter);
        		}
        	}
        }
    	return numbers.lastKey();
      }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindUniqueKata.findUniq(new double[]{1, 1, 1, 2, 1, 1});
		// FindUniqueKata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 });
	
	}

}
