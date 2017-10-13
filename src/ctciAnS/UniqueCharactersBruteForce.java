package ctciAnS;

public class UniqueCharactersBruteForce {

	public static void main(String[] args) {
		String input ="teir";
		if(input==null)
			throw new NullPointerException();
		System.out.println(isUnique(input));

	}
	private static boolean isUnique(String input) {
		char[] array = input.toCharArray();
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j])
					return false;
			}
		}
		return true;
	}
}
//time complexity is O(n^2)
//space complexity is O(n)