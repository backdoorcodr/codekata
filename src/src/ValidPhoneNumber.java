package src;

import java.util.regex.Pattern;

public class ValidPhoneNumber {

	
	public static boolean validPhoneNumber_2(String phoneNumber) {
	    return Pattern.matches("^\\(\\d{3}\\) \\d{3}-\\d{4}$", phoneNumber);
	  }
	
	static String phoneRegex = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-{4}|\\(\\d{3}\\)-\\d{3}-?\\d{4}|\\(\\d{3}\\) \\d{3}?\\d{4}|\\(\\d{3}\\)-\\d{3}?\\d{4}|\\(\\d{3}\\) \\d{3}-?\\d{4}";
	
	public static boolean validPhoneNumber(String phoneNumber) {
		// TODO: Return whether phoneNumber is in the proper form
		if (phoneNumber.matches(phoneRegex)) {
			return true;
		} else return false;	    
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPhoneNumber o = new ValidPhoneNumber();
		System.out.println(o.validPhoneNumber("(123) 456-7890"));
		System.out.println(o.validPhoneNumber("(1111)555 2345"));
		System.out.println(o.validPhoneNumber("(098) 123 4567"));
		System.out.println(o.validPhoneNumber("(123)456-7890"));
		
		
		
		
		

	}

}
