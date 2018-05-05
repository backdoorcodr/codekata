package src;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class CountSmileys {

	
	public static int countSmileys_2(List<String> arr) {
	    return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();   
	  }
	
	public static int countSmileys(List<String> arr) {
	      // Just Smile :)
		int count = 0;
		String smileyRegex = "[:;][-~]?[DP)]";
		
		for (String emoti : arr) {
			if (Pattern.matches(smileyRegex, emoti)) count++;		
		}
	      return count;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountSmileys o = new CountSmileys();
		
		List<String>a = new ArrayList<String>();
		
		// a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
		
		
		String [] temp = {";p", ";x", ";-P", ";p",
		                  "42D", ";~)", ";)", ":D", 
		                  "'D", "4X", "o~D)", ":x)", ":~)", 
		                  "oX", "p)", ";P", ":-D", "-5D", "()", 
		                  "5~)", ":p", "')D", "(D", ":D", ";~D", 
		                  "'D", ":p)", "'D", ";P", ";XD", "-:P", "4dx", ";~x)", 
		                  ";~)", "(x", "5p", "~;D"};
		
		for (String t : temp) {
			a.add(t);
		}
		System.out.println(CountSmileys.countSmileys(a));
	}

}
