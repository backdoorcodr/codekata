package src;

public class SmallestInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] i = {2,3,1,-1,-355};
		int smallest = i[0];
		for (int idx = 0; idx<i.length; idx++) {
			if (i[idx] < smallest) {
				smallest = i[idx];
			}
		}
		System.out.println(smallest);
	}
	
    public static int findShort(String s) {
        String [] words = s.split(" ");
        String shortest_word = words [0];
        for (int idx = 0; idx < words.length; idx++){
        
        if (words[idx].length() < shortest_word.length()) {
        
        shortest_word = words [idx];
        }
        }
    return shortest_word.length();
    }

}
