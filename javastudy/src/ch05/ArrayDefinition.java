package ch05;

public class ArrayDefinition {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30 }; // 3개
		int[] arr2 = { 20, 40, 50, 70 }; // 4개
		int[] arr3 = new int[4]; // 배열의 크기 4 : 0 ~ 3
		arr3[0] = 10;
		arr3[1] = 20;
		arr3[2] = 30;
		arr3[3] = 40;
//		arr3[4] = 50;	// 없는 영역을 침범하게 되고 예외가 발생	
		int[] arr4 = new int[] { 1, 2, 3 };
		// {}내의 요소만큼 갯수가 정해지므로 new int[]
		int[] arr5 = null;
//		arr5 = {1, 2, 3};	// 허용이 안됨 : 배열? 변수?
		int[] arr6 = { 1, 2, 3 }; // 허용

		arr5 = new int[] { 1, 2, 3 }; // 허용
	}

}
