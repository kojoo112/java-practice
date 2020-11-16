package ch04;

public class BreakOuterExample {

	public static void main(String[] args) {
		// 대문자 A ~ Z
		outer: for (char upper = 'A'; upper <= 'Z'; upper++) { // 반복문1
			// 반복문 : 소문자 a ~ z
			for (char lower = 'a'; lower <= 'z'; lower++) { // 반복문2
				System.out.println(upper + " : " + lower);
				if (lower == 'g') {
					break outer; // 나를 감싸고 있는 반복문(2번)을 벗어남.
				}
			}
		}

	}

}
