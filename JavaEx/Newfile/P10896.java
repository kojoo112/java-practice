package Newfile;

import java.util.Scanner;

public class P10896 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		int sub = a - b;
		int mtp = a * b;
		int dev = a / b;
		int nam = a % b;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mtp);
		System.out.println(dev);
		System.out.println(nam);
		sc.close();
	}

}
