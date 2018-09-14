package src;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

	public String toJadenCase(String phrase) {
		if ("".equals(phrase) || phrase == null) {
			return null;
		}
		return Arrays.asList(phrase.split(" ")).stream().map(word -> {
            return Character.toUpperCase(word.charAt(0)) + word.substring(1);
        }).collect(Collectors.joining(" "));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JadenCase o = new JadenCase();
		System.out.println(o.toJadenCase("aaa upper case"));

	}

}