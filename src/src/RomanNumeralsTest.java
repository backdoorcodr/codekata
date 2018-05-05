package src;

import org.junit.*;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RomanNumeralsTest {

	@Parameters(name= " roman[{0}]={1}")
	public static Iterable<Object[]> data() 
	{
		return Arrays.asList(new Object[][] { 
			{ 0, "" }, { 1, "I" }, { 2, "II" } , { 5, "V" }
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
		
		String result = "";
		for (int idx = 0; idx < i; idx++) {
			result = result + "I";
		}
		return result;
	}

}
