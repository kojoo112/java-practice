package ch05;

/*
 *  String[] args : 자바 프로그램을 실행할 때 파라미터를 입력받을 수 있고
 *  				그 값을 사용할 때 사용
 */
public class ArgumentInput {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) { // 입력받은 파라미터를 출력
			System.out.println("args [ " + i + " ] = " + args[i]);

		}

	}
	// cmd 창에서 실행할 경우
	// java ArgumentIuput 10 20
}
