package src;

public class PerfectPower {
	
	public static int[] isPerfectPower_2(final int n) {
        for (int i = 2, t; ; i++) {
            if ((t = (int) Math.round(Math.pow(n, 1.0 / i))) < 2) return null;
            if ((int) Math.pow(t, i) == n) return new int[]{t, i};
        }
    }
	
	public static int[] isPerfectPower(int n) {
		for (int i = 2; i < Math.log(n) / Math.log(2) + 1; i++) {
			for (int j = 2; Math.pow(j, i) <= n; j++) {
				if (Math.pow(j, i) == n) {
					return new int[] { j, i };
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
