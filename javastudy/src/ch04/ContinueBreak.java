package ch04;

public class ContinueBreak {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) { // 단 //3의 배수만 출력
			// 2 ~ 9 까지 반복
			if (i % 3 != 0) { // i가 3의 배수가 아니면
				continue;
			}
			// 3의 배수만 여기로 내려오고 3의 배수가 아니면 6행 i < 10 비교문으로 이동
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) { // i==j전까지만 출력
				// j가 i보다 크면 출력을 하지 않고 싶다.
				if (j > i) {
					break;
				}
				System.out.println(i + " * " + j + " = " + i * j);

			}
			System.out.println(); // 줄 바꾸기
		}

	}

}
