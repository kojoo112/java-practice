package ch05;

public class GugudanExample {

	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) { // 2단 ~ 9단
			// i = 2, 3, 4... 9 -> 반복
			System.out.println(i + " 단 ");
			// 단 * 1 ~ 단 * 9 : 반복문 1 ~ 9 까지 반복
			for(int j = 1; j<10; j++) {
				// j : 1, 2, 3 ... 8, 9 까지 반복
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
			
	}

}
