package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestInt

{

	public static long findLongest(long[] numbers) {
		long max_length_num = 0;
		long previous_max_num = 0;

		Map<Long, Long> map = new LinkedHashMap<Long, Long>();

		long max_num = 0;

		for (long v : numbers) {
			long length = String.valueOf(v).length();
			map.put(v, length);
		}
		Map<Long, Long> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.limit(100).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		Map.Entry<Long, Long> entry = sorted.entrySet().iterator().next();
		Long key = entry.getKey();
		Long value = entry.getValue();

		return key;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestInt o = new LongestInt();
		long[] array = { -955500458, -1019688246, -1242882, -401659876, -1556575539, -399966325, -2100699450,
				-1723236537, -629494378, -2136128783, -1383966071, -544076870 };
		System.out.println(o.findLongest(array));

	}

}
