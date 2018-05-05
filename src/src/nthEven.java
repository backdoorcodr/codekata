package src;

import java.util.HashMap;

public class nthEven {

	public void generateEven(int limit) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int key = 0;
		
		while (key <= limit) {
		
			
			
		}
	}
	public static int nEven(int n) {
		  // write your code here
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int key = 1;
		map.put(key, 0);
		
		for (int i = 2; i < n*2; i++) {
			
			if (i%2 == 0) {
				key++;
				map.put(key, i);
			}
		}
		return map.get(n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(nthEven.nEven(1298734));
		
		
	
		int k = 4;
		// System.out.println(2*(k-1));
		
		System.out.println(k*(2 ^ k) + 1);
	}

}
