package lesson17;
import java.util.HashMap;
import java.util.Map;

public class WordFreqCounter {
	private String text;

	public WordFreqCounter(String text) {
		this.text = text;
	}

	public void print() {
		Map<String, Integer> result = getMap();
		for (Map.Entry<String, Integer> element : result.entrySet()) {
			System.out.println("word: " + element.getKey() + " count: " + element.getValue() + ";");
		}
	}

	private Map<String, Integer> getMap() {
		Map<String, Integer> result = new HashMap();
		if (text.isEmpty())
				return result;
		String[] words = text.split(" ");		
		for (String element : words) {
			if (result.containsKey(element)) {
				result.put(element, result.get(element) + 1);
			} else {
				result.put(element, 1);
			}
		}
		return result;
	}	
}
