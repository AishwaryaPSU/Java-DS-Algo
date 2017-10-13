package easy;

public class Sum {

	public static void main(String[] args) {
		int input=5;
		sumOfN(input);
	}
	private static void sumOfN(int input) {
		if(input==1)
			System.out.println(input);
		else
		{
				System.out.println((input*(input+1))/2);
				sumOfN(input-1);
			
		}
	}


}
