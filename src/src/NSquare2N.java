package src;

import java.math.BigInteger;

public class NSquare2N {
	public static BigInteger get(int n) {
        // Your code here!
		int squared = (int) Math.pow(n, 2);
		boolean check = false;
		
		String string_squred = String.valueOf(squared);
		String string_number = String.valueOf(n);
		
		if (string_squred.substring(string_squred.length() - string_number.length(),
				string_squred.length()).equals(string_number) ) 
			System.out.println("matched"); 
		else System.out.println("no match");
		
		System.out.println(string_squred);
        return null;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NSquare2N.get(2890625);

	}

}
