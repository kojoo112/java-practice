package Newfile;

public class BookUDDT {
	public String title;
	public int price;
	public String company;
	
	
	public BookUDDT() {
		this.title = "자바";
		this.price = 16000;
		this.company = "회사";
	}
	
	public BookUDDT(String title, int price, String company) {
		this.title = title;
		this.price = price;
		this.company = company;
	}
	public BookUDDT(String title, int price) {
		this.title = title;
		this.price = price;		
	}
	public BookUDDT(int price, String title) {
		this.title = title;
		this.price = price;		
	}
	
}
