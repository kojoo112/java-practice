package ch05;

import java.util.Scanner;

/*
 *  배열 : 
 */
public class ArrayExample {

	public static void main(String[] args) {
		// 수강생 수만큼 변수를 할당하고 나이를 저장해야 함
		int age1 = 20;	// 나이
		int age2 = 26;
		int age3 = 30;
		// ...
		int age24 = 25;	// 변수 24개를 선언하고 값을 저장
		// 나이의 평균을 계산하려면
		int sum = age1 + age2 + age3 + /* ... */ age24;
		double avg = (double) sum / 24;
		
		// 배열을 사용
		String name1 = "홍길동";
		String name2 = new String("임꺽정");
		
		// 방법1 : 프로그램에서 고정된 값을 사용할 
		int s1[] = {20, 30, 40, 50, 60};	// 배열의 크기 : 5
		// 방법2 : 가변될 수 있음 (수를 정할 수 있음)
		int student[] = new int[24];	//배열
		int[] s2 = new int[3];
		int []s3 = new int[4];
		// 배열은 반복문을 사용하기가 용이.
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 24; i++) {
			System.out.println("나이: ");
			student[i] = sc.nextInt();
		}
		for(int i = 0; i < 24; i++) {
			System.out.println(i +"번째, 나이: " + student[i]);
		}
	}

}
