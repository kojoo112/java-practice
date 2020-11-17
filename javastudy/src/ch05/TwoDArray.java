package ch05;

/*
 *  다차원 배열 
 *  int[] arr = {1, 2, 3} // 1차원 배열
 *  int[][] twod = { {1, 2, 3}, {3, 4, 5} }
 *  int[][][] threed; 
 */
public class TwoDArray {

	public static void main(String[] args) {
		int arr1[] = { 3, 4, 5 };
		int twod[][] = { { 3, 4, 5 }, { 1, 2, 3 } };
		int twod1[][] = { { 2, 3 }, { 3, 4, 5 } };
		int twod2[][] = new int[4][5];
		int twod3[][] = new int[2][];
		twod3[0] = new int[4];
		twod3[1] = new int[5];
		System.out.println(twod3.length);
		System.out.println(twod3[0].length);
		System.out.println(twod3[1].length);

		for (int i = 0; i < twod1.length; i++) {
			// i : 0, 1
			for (int j = 0; j < twod1[i].length; j++) {
				System.out.println(twod1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
