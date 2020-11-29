package Ch01;

public class Sum {

	public static void main(String[] args) {
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		
		hap(a, b, c);

	}
	public static void hap(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println(sum);
	}

}
