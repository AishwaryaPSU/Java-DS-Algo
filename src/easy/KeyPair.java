package easy;

import java.util.Arrays;

public class KeyPair {

	public static void main(String[] args) {
		int[] array = {8,1,9,6,2,4,5,-1,3};
		int key = 7;
		if (array.length == 0) {
			System.out.println("empty array");
		} else
			containsPair(array, key);
	}

	private static void containsPair(int[] array, int key) {
		Arrays.sort(array);
		if (array[0] >= key) {
			System.out.println("No elements add up to the given key");
		} else {
			int x = 0, y = array.length - 1;
			while (x < y) {
				if ((array[x] + array[y]) == key) {
					System.out.println("[" + array[x] + "," + array[y] + "]");
					x++;
					y--;
				} else if ((array[x] + array[y]) > key) {
					y--;
				} else if ((array[x] + array[y]) < key) {
					x++;
				}
			}
		}
	}
}
