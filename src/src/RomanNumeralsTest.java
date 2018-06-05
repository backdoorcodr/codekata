package src;

import org.junit.*;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.hamcrest.CoreMatchers.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RomanNumeralsTest {

	@Parameters(name= " roman[{0}]={1}")
	public static Iterable<Object[]> data() 
	{
		return Arrays.asList(new Object[][] { 
			{ 0, "" }, { 1, "I" }, { 2, "II" } , { 5, "V" }, { 6, "VI" }, { 10, "X" }, { 20, "XX" }, { 4, "IV" }, {1984, "MCMLXXXIV"}
	});
	}

	private String expected;
	private int input;
	
	public RomanNumeralsTest(int input, String expected) {
		this.input = input;
		this.expected = expected;
	}
	
	@Test
	public void testRoman() {
		assertThat(toRomanNumber(input), is(equalTo(expected)));
	}

	private String toRomanNumber(int i) {
		
		HashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");
		
		String result = "";
		int difference = i;

		for (int key : map.keySet()) 
		{
		while (difference >= key) {
			result += map.get(key);
			difference -= key;
		}
		}
		
		return result;
	}

}
