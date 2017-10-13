package ctciAnS;

public class Test {

	public static void main(String[] args) {
		String input = "Aish";
		String regex = "[01689]*";
		
		if(input.matches(regex)) {
			System.out.println("invalid input");
		}
		else System.out.println("valid ip");
	}

}
