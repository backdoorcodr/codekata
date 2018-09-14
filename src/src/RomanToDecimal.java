package src;

import org.junit.*;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RomanToDecimal {

	@Parameters(name= " roman[{0}]={1}")
	public static Iterable<Object[]> data() 
	{
		return Arrays.asList(new Object[][] { 
			{ "", 0 }, { "I", 1 }, { "II", 2 }, { "V", 5 }, { "VI", 6 }, { "VII", 7 },
			{ "IV", 4 }, { "X", 10 }, { "XV", 15 }, { "IX", 9 }, { "XX", 20 }, { "L", 50 }, { "XL", 40 }, 
			{ "C", 100 }, { "XC", 90 }, { "D", 500 }, { "CD", 400 }, { "M", 1000 }, { "CM", 900 }, 
			{ "MCMLXXXIV", 1984 } });
	}

	private int expected;
	private String input;
	
	public RomanToDecimal(String input, int expected) {
		this.input = input;
		this.expected = expected;
	}

	int counter = 0;
	
	@Before 
	public void setup() {
		counter = 0;
	}
		
	@Test
	public void testDecimal() {
		assertThat(toDecimalNumber(input), is(equalTo(expected)));
	}

	private int toDecimalNumber(String i) {
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("M", 1000);
		map.put("CM", 900);
		map.put("D", 500);
		map.put("CD", 400);
		map.put("C", 100);
		map.put("XC", 90);
		map.put("L", 50);
		map.put("XL", 40);
		map.put("X", 10);
		map.put("IX", 9);
		map.put("V", 5);
		map.put("IV", 4);
		map.put("I", 1);

		if("".equals(i)){
			return 0;
		}
		final String compare = i;
		Optional<String> entryOpt = map.keySet().stream().filter(x->compare.startsWith(x)).findFirst();
		String entry = entryOpt.get();
		
		i = i.substring(entry.length(), i.length());	
		return map.get(entry) + toDecimalNumber(i);
	}
}
