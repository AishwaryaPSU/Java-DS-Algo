package easy;

public class Factorial {

	public static void main(String[] args) {
		int input = 0;
		System.out.println(fact(input));

	}
	private static int fact(int input) {
		if(input<=1) {
			return 1;
		}
		else
		{
			return input*fact(input-1);
		}
	}
}
