package src;
import java.math.BigInteger;


public class TrailingZeroes {

	
	public static int findZeroes(BigInteger factorial) {
		
		String s = String.valueOf(factorial);
		int counter = 0;
		while(counter < s.length() && s.charAt(s.length() - 1 - counter) == '0') {
		    counter++;
		}
		return counter;
	}
	
	static int findFactorial(int n) {
		BigInteger fact = new BigInteger("1");
		BigInteger inc = new BigInteger("1");
		
		for (int c = 1; c <= n; c++) {
		      fact = fact.multiply(inc);
		      inc = inc.add(BigInteger.ONE);
		    }
		return findZeroes(fact);
		
	}
	
	static int findTrailingZeros(int n)
    {
        // Initialize result
        int count = 0;
        // Keep dividing n by powers of 5 and update count
        for (int i=5; n/i>=1; i *= 5)
            count += n/i; 
        return count;
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(TrailingZeroes.findTrailingZeros(1000));
		
		System.out.println(TrailingZeroes.findFactorial(1000));
		
	}

}
