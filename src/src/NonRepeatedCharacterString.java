package src;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedCharacterString {

	public char getString (String source) {
		
		char non_duplicate_characters = '0';
		Map <Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int idx = 0; idx < source.length(); idx++) {
			char c = source.charAt(idx);
			if (map.containsKey(c)) {
				int occ = map.get(c);
				occ++;
				map.put(c, occ);	
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		for (int idx = 0; idx < source.length(); idx++) {
			char key = source.charAt(idx);
			if (map.get(key) == 1) {
				non_duplicate_characters = source.charAt(idx);
				return non_duplicate_characters;
			}
		}
		return non_duplicate_characters;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonRepeatedCharacterString object = new NonRepeatedCharacterString();
		char c = object.getString("test");
		System.out.println(c);
	}

}
