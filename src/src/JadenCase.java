package src;

public class JadenCase {

	static String regex = "\\W+";
	

	public String toJadenCase(String phrase) {
		if ("".equals(phrase) || phrase == null) {
			return null;
		}
		String result = "";
		String[] words = phrase.split(regex);
		
		for (String word: words) {
			result = result + getUpperCaseWord(word) + " ";
		}
		return result.trim();
	}
	
	String getUpperCaseWord(String word) {
		return word.substring(0, 1).toUpperCase() + word.substring(1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JadenCase o = new JadenCase();
		System.out.println(o.toJadenCase("to upper case"));
		
		
		

	}

}