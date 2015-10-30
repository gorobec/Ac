package lesson17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MainAL {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("A", 2);
		map.put("BC", 12);
		map.put("C", 21);
		map.put("BBA", 2);
		map.put("ACC", 20);
		map.put("AX", -2);
		
		
		for (Map.Entry<String, Integer> element : map.entrySet()) {
			System.out.println(element.getKey() + "___" + element.getValue());
		}
		
		Map<String, Integer> sortedMap = new TreeMap();
		sortedMap.putAll(map);
		
		System.out.println(sortedMap);
		
		map.put("AX", 98);
		Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<String, Integer> temp = iter.next();
			System.out.println(temp.getKey() + "    " + temp.getValue());
//			temp.setValue(temp.getValue() + 1);
		}
		
		if (map.containsKey("C")) {
			map.put("C", map.get("C") + 1);
		}
	
		System.out.println(map);
	}

}
