package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class FruitMachine {

	static LinkedHashMap<String, int[]> scores = new LinkedHashMap<>();
	
	public static void init(String[] array) {
		
		int idx = 0; 
		int twoOfSamePlusOneWild;
		for (int i = array.length; i > 0 ; i--) {
			if (array[idx].equals("Wild")) {
				twoOfSamePlusOneWild = 0;
			} else {
				twoOfSamePlusOneWild = i*2;
			}
			scores.put(array[idx], new int[] {i*array.length, i, twoOfSamePlusOneWild});
			idx ++;
		}
		
		/*
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " : " + Arrays.toString(scores.get(array[i])));
		} */
		
	}
	public static int getScore(ArrayList<String> keys) {
		
		

		return 0;
		
	}
	
	public static int fruit(final String[][] reels, final int[] spins) {
    
		
		ArrayList<String> results = new ArrayList<>();
		
		for ( int idx = 0; idx < spins.length; idx++ ) {
			int spinResult = spins [idx];
			String reelResult = reels [idx] [spinResult];
			results.add(reelResult);
		}
		
		System.out.println(results);
		
		return getScore(results); // Code here
    }
   
	 
	public static void main(String[] args) {

		String[] reel1 = {"Wild","Star","Bell","Shell","Seven","Cherry","Bar","King","Queen","Jack"};
		String[] reel2 = {"Wild","Star","Bell","Shell","Seven","Cherry","Bar","King","Queen","Jack"};
		String[] reel3 = {"Wild","Star","Bell","Shell","Seven","Cherry","Bar","King","Queen","Jack"};
		
		FruitMachine.init(reel1);
		
		String[][] reels = {reel1, reel2, reel3};
		
		int[] spin  = {5,5,5};
		
		int result = fruit(reels, spin);
		
	} 

}
