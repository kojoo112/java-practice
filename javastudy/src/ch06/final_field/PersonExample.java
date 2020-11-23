package ch06.final_field;

public class PersonExample {

	public static void main(String[] args) {
		Person p = new Person("20001020 - 1000000", "홍길동");
//		p.nation = "Japan";	// 에러 발생 : final은 수정 불가능
	}

}
