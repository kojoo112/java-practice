package ch05;

import java.util.Scanner;

// 	배열의 길이를 입력받아서 크기를 할당
public class VariableSize {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();		// 1. 데이터의 갯수
		int[] arr1 = new int[size];		// 배열의 크기를 입력받아서
		int total = 0;
		for(int i = 0; i < arr1.length; i++) {
			System.out.print("데이터: ");
			arr1[i] = sc.nextInt();
			total += arr1[i];
		}
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
 		}
		System.out.println();
		System.out.println("합 : " + total);
	}

}
