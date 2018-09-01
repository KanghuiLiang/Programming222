package programming2Week2;

public class Swordsmen extends CharacterWeapon implements Travel, Defense{
	private String Type=" ";
	
	public Swordsmen(int hp,String name,Weapon weapon, Armor armor, String Type) {
		super(hp,name,weapon,armor);
		if (this.Type.equalsIgnoreCase("Agility")||(this.Type.equalsIgnoreCase("Strength")))
				this.Type = Type;
		else
			this.Type = "Agility";
	}
	
	public Swordsmen(String name) {
		super(name);
		this.hp=10;
		this.weapon = new Weapon("TestHui",1000,"o");
		this.armor= new Armor("h","k","l");
		this.Type =" hui";
		
	}
	
	public void attack() {
		System.out.println("A Swordsman attacked with Stab");
	}
	
	public void slash() {
		if (this.Type.equalsIgnoreCase("Agility"))
			System.out.println("High-speed Slash");
		else
			System.out.println("Powerful Slash");
	}
    
	public String toString() {
		return "You are the swordsman!\n"+super.toString();
		
	}

	@Override
	public void Defense() {
    System.out.println("Swordsmen: Defences with Shield ");		
	}

	@Override
	public void Travel() {
		// TODO Auto-generated method stub
		System.out.println("Swordsmen: Travel with Pegasus");
		
	}
}
