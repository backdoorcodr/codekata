package src;

import java.util.ArrayList;

public class StripComments {

	public static String stripComments(String text, String[] commentSymbols) {
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
		
		for (int idx = 0; idx < temp.size(); idx++) {
			String line = temp.get(idx);
			line = line.trim();
			stripped = stripped + line;
			 if (idx != temp.size() - 1)
			 stripped = stripped  +"\n";
		}
		
		
		return stripped;
	
}
	public static void main(String[] args) {

		StripComments o = new StripComments();
		System.out.println(o.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" }));
	}
}
