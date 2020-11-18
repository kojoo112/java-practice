package ch05;	// 디렉토리
// 앱을 구별하는 고유 식별자 : 안드로이드 앱
// 하위 패키지는 기능별로 디렉토리를 만들어서 사용한다.

public class ArrayExample121212121212 {	// 시작과 끝을 '{', '}'을 사용

	// 실행을 할 때 필요.
	// 독립적으로 실행을 시킬 수 있다. java <c:\Users\Admin> className
	public static void main(String[] args) {
		
		/*
		 *  배열 : 같은 유형의 데이터를 여러 개 저장하고 사용하기 위해 사용
		 */
		
		int arr1[] = { 1, 3, 5, 7 };	// 배열선언과 초기 값을 할당
		// array.length : 배열의 크기
		// 배열을 출력
		for (int i = 0; i < arr1.length; i++) {
			// i : 0, 1, 2, 3
			System.out.println(arr1[i]);
		}
		// i = 4 (i는 for문을 벗어났으므로 사용 불가)
		
		int[] arr2 = { 2, 4, 6, 8 };	// []의 위치는 앞 뒤로 가능
//		[]int arr3 = { 3, 6, 9};		// 에러
		
		int[] arr4 = new int[5];		// new 생성자를 사용 
		// 초기값은 0이 된다. arr4[0] = 0, arr4[1] = 0, ...
		// new 생성자가 0으로 초기화한다.
		int[] arr5 = new int[] { 10, 20, 30 };	// 생성 및 초기화
		// 배열의 크기를 넣어주지 않아도 초기화 데이터의 수만큼 크기가 결정된다.
		// 기본 데이터 타입 int 배열
		
		String str1[] = new String[3];	// String 참조변수의 배열
		// 초기값은 null -> 참조변수이기 때문
		str1[0] = "홍길동";	// str[0]에는 String 객체의 주소가 저장됨
//		System.out.printf("%x\n", str1[0]);
//		System.out.printf("%x\n", str1[1]);
		
		int twod[][] = new int[2][3];	// 2차원 배열
		int twod2[][] = {{2,3,4},{1,2,3,4}};
		/*
		 * 열 0 : 2, 3, 4
		 * 열 1 : 1, 2, 3, 4
		 * twod2[0][0], twod2[0][1], twod2[0][2]
		 * twod2[1][0], twod2[1][1], twod2[1][2], twod2[1][3]
		 * 열의 수 : twod2.length
		 * 열 0의 행의 수 : twod2[0].length
		 * 열 1의 행의 수 : twod2[1].length
		 */
		int i = 0;
		
		for(int arr10[] /*1차원배열*/ : twod2 /*2차원배열*/) {
			for (int num /* 기본데이터타입 */ : arr10 /* 1차원배열 */) {
				System.out.println(num + " ");
			}
			System.out.println();
		}
	}

}
