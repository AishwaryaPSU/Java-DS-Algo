package easy;

public class LinearSearch {

	public static void main(String[] args) {
		int inputArray[] = {1,2,3,4,5,6};
		int searchElement = 3;
		System.out.println(lsearch(inputArray,searchElement));

	}
	private static boolean lsearch(int[] inputArray,int searchElement) {
		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i]==searchElement)
				return true;
		}
		return false;
	}
}
