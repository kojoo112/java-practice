package Newfile;

public class BookEx {

	public static void main(String[] args) {
		BookUDDT b1 = new BookUDDT();
		System.out.println(b1.title);
		System.out.println(b1.price);
		System.out.println(b1.company);
		
		BookUDDT b2 = new BookUDDT("파이썬", 13000, "회사");
		System.out.println(b2.title);
		System.out.println(b2.price);
		System.out.println(b2.company);
		
		BookUDDT b3 = new BookUDDT("자바 스크립트", 12400);
		System.out.println(b3.title);
		System.out.println(b3.price);
		
		BookUDDT b4 = new BookUDDT(25000, "자바 스크립트2");
		System.out.println(b4.title);
		System.out.println(b4.price);
		
		
		
		
	}

}
