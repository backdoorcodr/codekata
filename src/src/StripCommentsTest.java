package src;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class StripCommentsTest {

	public static String stripComments(String text, String[] commentSymbols) {
	    System.out.println(text);
			String[] lines = text.split("\n");
			ArrayList<String> temp = new ArrayList<>();
			String stripped = "";
			for (String line : lines) {
				boolean comment_symbols = false;
				for (String sign : commentSymbols) {
					if (line.contains(sign)) {
						line = line.substring(0, line.indexOf(sign));
						temp.add(line);
						comment_symbols = true;
					}
				}
				if (!comment_symbols) temp.add(line); 
			}
			

			String listString = String.join(", ", stripped);
			
			return listString;
		
	}
	@Test
	public void stripComments() throws Exception {
		assertEquals(
				"apples, pears\ngrapes\nbananas",
				StripComments.stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" } )
		);

		assertEquals(
				"a\nc\nd",
				StripComments.stripComments( "a#b\nc\nd $e f g", new String[] { "#", "$" } )
		);

	}

}
