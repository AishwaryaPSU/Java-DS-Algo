package easy;

public class StringPrint {

	public static void main(String[] args) {
		String input="Barrack Obama";
		for(String ip:input.split(" ")) {
			strOP(ip);
		}
	}
	private static void strOP(String input) {
		/*
	    char[] array =input.toCharArray();
		int j;
		for(int i=0;i<array.length;i++) {
			j=0;
			while(j<=i) {
				System.out.print(array[j]);
				j++;
			}
			System.out.println();
		}*/
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<input.length();i++) {
			System.out.print(sb.append(input.charAt(i)));
			System.out.println();
		}
		
	}

}
