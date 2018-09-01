package practice;

public class Weapon {
	private String name;
	private int damage;
	private String type;

	
	public Weapon(String name, int damage, String type) {
		this.name = name;
		this.damage = damage;
		if (type.equalsIgnoreCase("Melee")||type.equalsIgnoreCase("Range")) //donot use this.type here
				this.type = type;
		else
			   this.type ="Melee";
		this.type = type;
	}
	
	public Weapon(String type) {
		this.name = "HEY";
		this.damage = 1000;
		if (type.equalsIgnoreCase("Melee")|| type.equalsIgnoreCase("Range"))
				this.type = type;
		else
			   this.type ="Melee";
	}
	
	
	public String toString() {
		return "Weapon name: " + name +"\ndamage: "+damage+"\nType: "+type;
	}
	
	
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
