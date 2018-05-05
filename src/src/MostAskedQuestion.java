package src;

import java.util.regex.Pattern;

public class MostAskedQuestion {

	
	  public static boolean detect (String comment){
		    // your code
		 
		  return comment.startsWith("Can someone explain");
		  // return Pattern.compile(Pattern.quote("Can someone explain"), Pattern.CASE_INSENSITIVE).matcher(comment).find();
		    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MostAskedQuestion.detect("test"));

	}

}
