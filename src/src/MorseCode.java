package src;

public class MorseCode {
	public static String decode(String morseCode) {
	      String result = "";
	      for(String word : morseCode.trim().split("   ")) {
	        for(String letter : word.split("\\s+")) {
	          result += MorseCode.get(letter);
	        }
	        result += ' ';
	      }
	      return result.trim();
	    }
	
	private static String get(String letter) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
