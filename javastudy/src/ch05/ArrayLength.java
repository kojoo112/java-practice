package ch05;

public class ArrayLength {

	public static void main(String[] args) {
		int score[] = { 30, 40, 50 };	// 배열을 선언, 값을 할당
		int hab = 0;
		for (int i = 0; i < score.length; i++) {	// 반복문
			// i : 0, 1, 2
			// score[0], score[1], score[2]
			// 30, 40, 50
			hab += score[i];
			System.out.println(hab); // 누적
		}
		double avg = (double) hab / score.length;
		System.out.println("평균 : " + avg);
	}

}
