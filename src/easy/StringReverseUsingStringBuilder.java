package easy;

public class StringReverseUsingStringBuilder {

	public static void main(String[] args) {
		String inputString = "Penn state";
		StringBuilder reversedString = new StringBuilder();
		reversedString.append(inputString);
		reversedString.reverse();
		System.out.println(reversedString);
	}

}
