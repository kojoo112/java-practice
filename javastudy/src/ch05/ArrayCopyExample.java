package ch05;

/*
 *  배열 : 한번 크기가 정해지면 크기변경이 불가하다.
 */
public class ArrayCopyExample {

	public static void main(String[] args) {
		int arr1[] = new int[] {1, 3, 5};	// 3개
		// 더 많은 요소를 저장할 필요가 생김.
		int arr2[] = new int[10];	// 10개
		// arr1 -> arr2에 복사
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			
		}
		arr2[3] = 7;
		arr2[4] = 9;
		
		int arr3[] = {2, 4, 6};
		int arr4[] = new int[10];
		// arr3 -> arr4 복사
//		System.arraycopy(arr3, 0, arr4, 0, arr3.length);
		System.arraycopy(arr3, 1, arr4, 6, 2);
		for(int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " ");	// 한 줄에 출력
		}
		System.out.println();
		
		// 향상된 for문
		// : 여러 개(배열, 컬렉션)
		int i = 0;
		for(int value : arr4) {
			// int value : 0, 0, 0, 0, 0, 0, 4, 6, 0, 0
			// i : 0, 1, 2, 3, 4, ...
			System.out.print(value + " ");
			i++;
		}
		System.out.println();
	}

}

/*
 * 데이터 구조체
 * stack, queue : 배열을  사용해서 구현
 * 배열 : 크기가 한정이 된다.
 * 1. stack의 크기를 3개
 * 2. 데이터가 늘어나서 10개를 저장
 * 3. stack의 크기를 늘려주어야 한다.
 * 
 */
