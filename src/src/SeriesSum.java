package src;

public class SeriesSum {

	
	public static String showSequence(int value){
		StringBuilder str = new StringBuilder();
		if (value == 0) return str.append(value + "=" + "0").toString();
		if (value > 0) {	
		int idx = 0;
		int sum = 0;
		while (idx <= value) {
			str.append(idx);
			sum += idx;
			if (idx != value )str.append("+");
			idx++;
		}
		str.append("="+sum);
		} else {
			str.append(value + "<" + "0");
		}
		return str.toString();
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SeriesSum.showSequence(0));

	}

}
