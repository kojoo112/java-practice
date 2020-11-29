package Ch01;

public class Ex {

	public static void main(String[] args) {
		Ex e = new Ex();
		int a = 20;
		int b = 30;
	    e.sum(a,b);
	    System.out.println(sum1(a,b));
		
	}
	public Ex() {
		// TODO Auto-generated constructor stub
	}
	
	public void sum(int x , int y) {
		int hap = x + y;
		System.out.println(hap);
	}
	
	public static int sum1(int x , int y) {
		int hap1 = x + y;
		return hap1;
	}

}
