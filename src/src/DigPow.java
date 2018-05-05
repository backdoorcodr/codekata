package src;

public class DigPow {

	public static long digPow_2(int n, int p) {
	    String intString = String.valueOf(n);
	    long sum = 0;
	    for (int i = 0; i < intString.length(); ++i, ++p)
	      sum += Math.pow(Character.getNumericValue(intString.charAt(i)), p);
	    return (sum % n == 0) ? sum / n : -1;
	  }
	
	public static long digPow(int n, int p) {
		// your code
	String numbers = String.valueOf(n);
	int sum = 0;
	int idx = 0;
	while (idx < numbers.length()) {
		double number = Integer.valueOf(Character.toString(numbers.charAt(idx)));
		sum += Math.pow(number, p++);
		idx ++; 
	}
	if (sum % n == 0) return (sum / n);
	else return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DigPow.digPow(46288, 3));

		
		
	}

}
