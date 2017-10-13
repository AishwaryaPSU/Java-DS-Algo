package easy;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		String inputString = "agm";
		System.out.println(strRev(inputString));
	
	}
	private static String strRev(String inputStr) {
		char[] array = inputStr.toCharArray();
		char temp;
		for(int i=0;i<array.length/2;i++) {
			temp=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		}
		
		inputStr=Arrays.toString(array);
		return inputStr;
	}

}
