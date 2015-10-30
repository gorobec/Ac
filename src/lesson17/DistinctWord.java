package lesson17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctWord {
	private String[] lines;
	
	public DistinctWord(String[] lines) {
		this.lines = lines;
	}

	public void print() {
		System.out.println(printDistinctWords());
	}

	private List<String> printDistinctWords() {
		List<String> result = new ArrayList();
		Set<String> set = new HashSet();
		for (int i = 1; i < lines.length; i++) {
			set.addAll(getSetOfWords(lines[i]));
		}
		
		String[] words = lines[0].split(" ");
		for (String element : words) {
			if (!set.contains(element)) {
				result.add(element);
			}
		}
		
		return result;
	}
	
	private Set<String> getSetOfWords(String line) {
		Set<String> result = new HashSet();
		String[] words = line.split(" ");
//		for (String element : words) {
//			result.add(element);
//		}
		result.addAll(Arrays.asList(words));
		return result;
		
	}
}
