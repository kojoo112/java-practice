package Ch01;

public class Parent {
	 public String nation;

	  public Parent() {
	    this("홍길동");
	    System.out.println("Parent() call");
	  }

	  public Parent(String nation) {
	    this.nation = nation;
	    System.out.println("Parent(String nation) call");
	  }
}
