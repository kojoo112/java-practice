package ch06.access_modifier;

public class ClassA {
	// 생성자
	public ClassA() { }
	private ClassA(int p) {	}
	protected ClassA(String str) { }
	ClassA(int p, String prot){ }	// default
	
	// 필드
	public int pub1;
	protected String prot1;
	int def1;	// default
	private int pri1;

	
	
	// 메소드
	public void method1() { }
	protected void method2() { }
	void method3() { }
	private void method4() { }
	
}
class ClassC { }	// default
