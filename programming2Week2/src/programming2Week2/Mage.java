package programming2Week2;

public class Mage extends CharacterWeapon implements Travel, Defense {
	private String elemenet ="fire";	
	
	public Mage(int hp,String name,Weapon weapon,Armor armor,String element) {
		super(hp,name,weapon,armor);
		this.elemenet=element;
		
	}
	public Mage(String name) {
		super(name);
		this.weapon = new Weapon("Sword",1222,"Melee");
		this.armor = new Armor("ArmorNo1","POWER","WEAK");
	}
	
	public void attack() {
		System.out.println("A Mage attcked with a Punch");
	}
	
	public void castball() {
		System.out.println("Attack with "+this.elemenet +"ball."+"Damage = "+(weapon.Damage+50));
	}
	

	public String toString() {
        String message;
        message ="You are the Mege!\n";
        return message;
	}
	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("Mage: Defences with Magic Barrier");
		
	}
	@Override
	public void Travel() {
		// TODO Auto-generated method stub
		System.out.println("Mage: Travel with Flying Carpet");
		
	}
	

}
