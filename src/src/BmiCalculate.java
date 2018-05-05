package src;

import java.util.HashMap;
import java.util.Map;

public class BmiCalculate {

	public static String bmi(double weight, double height) {
	    double bmi = weight / (height * height);
	    System.out.println(bmi);
	    
	    if (bmi <= 18.5) return "Underweight";
	    if (bmi <= 25.0) return "Normal";
	    if (bmi <= 30.0) return "Overweight";
	    if (bmi > 30) return "Obese";
		
	    return "";
	  }
	
	HashMap<String, String> t = new HashMap<String, String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BmiCalculate.bmi(80, 1.80));
		

	}

}
