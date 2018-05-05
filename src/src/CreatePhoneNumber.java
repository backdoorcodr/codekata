package src;

public class CreatePhoneNumber {


	  public static String createPhoneNumber(int[] numbers) {
		    // Your code here!
		  String temp  = "";
		  String sign = "";
		  for (int idx = 0; idx < numbers.length; idx++) {
			  
			  switch(idx) {
				  case(0): { sign = "("; break; } 
				  case(3): { sign = ") ";  break; }
				  case(6): { sign = "-"; break; }
				  default: { sign = ""; break;}
			  }	
			  
			  temp = temp + sign + String.valueOf(numbers[idx]);			  
		  }
		  
		  return temp;
		  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] i = new int[] {4, 1, 3, 2};
		System.out.println(CreatePhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
		
	}
	}

