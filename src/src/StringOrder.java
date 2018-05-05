package src;

public class StringOrder {

	String your_order(String s) {
		
		if (s.isEmpty()) {
			return s;
		}
	
		String [] words = s.split(" ");
		String resultant[] = new String[words.length];
		String resultant_string = "";
		for (int idx = 0; idx < words.length; idx++) {
			resultant[idx] = " ";
		}
		
		for (int idx = 0; idx < words.length; idx++) {
			String word = words[idx];
			String numberOnly= word.replaceAll("[^0-9]", "");
			int idx_to_put_in = Integer.parseInt(numberOnly);
			resultant[idx_to_put_in-1] = word;
		}
		
		for (int idx = 0; idx < words.length; idx++) {
			resultant_string = resultant_string + resultant[idx];
			if (idx != words.length - 1) {
				resultant_string = resultant_string + " ";	
			}
		}
		return resultant_string;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOrder o  = new StringOrder();
		System.out.println(o.your_order("is2 Thi1s T4est 3a"));	
	}

}
