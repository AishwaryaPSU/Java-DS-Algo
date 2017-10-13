package ctciAnS;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PalindromePermutation {
	public static void main(String[] args) {
		String input = "tactcoa";
		char[] inputArray = input.toCharArray();
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (int i = 0; i < inputArray.length; i++) {
			if (!charCount.containsKey(inputArray[i])) {
				charCount.put(inputArray[i], 1);
	
			} else {
				int val=charCount.get(inputArray[i]);
				charCount.put(inputArray[i],val+1);
			}
		}
		System.out.println(charCount);
		recursiveStrPermutation(charCount);

	}
	public static void recursiveStrPermutation(Map<Character,Integer> charCount) {
		
	}
}