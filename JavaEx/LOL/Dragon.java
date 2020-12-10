package LOL;

public class Dragon {

	public String name;
	public double attackSpeed;
	public int attackDamage;
	
	
	public Dragon() {	
		this.name = "화염 드래곤";
		this.attackSpeed = 0.5;
		this.attackDamage = 100;
	}
	
	public Dragon(String name, double as, int ad) {
		this.name = name;
		this.attackSpeed = as;
		this.attackDamage = ad;
	}
	
	
	
}
