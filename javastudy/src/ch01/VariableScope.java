package ch01;

// 변수의 사용 범위
/* 변수는 블럭('{', '}') 내에서 선언 + 값을 저장
 * 
 */
public class VariableScope {
	static int f1 = 20; // class 블럭 영역내에 존재

	public static void main(String[] args) {
		int lv1 = 30; // main 블럭내에서 존재

		if (true) {
			int if1 = 30; // if블럭 내에서 존재
		}

		// if1은 if블럭을 벗어나므로 존재하지 않음

		for (int i = 0; i < 10; i++) {
			int v1 = i * 2; // for 블럭내에서 존재
		}

		// v1도 for 블럭을 벗어나므로 존재하지않음

		System.out.println("lv1 =" + lv1); // 같은 블럭내이므로 가능
		System.out.println("f1 =" + f1); // 더 바깥 블럭에 있으므로 가능
//		System.out.println("if1 =" + if1);		// 이미 종료된 블럭에 있음 (X)
//		System.out.println("v1 ="  + v1);		// 이미 지나간 블럭에 있음 (X)

	}

}
