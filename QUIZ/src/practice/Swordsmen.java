package practice;

public class Swordsmen extends Character implements Travel, defences{
	String type;
	public Swordsmen(Weapon weapon, String type) {
		super(weapon);
		if (type.equalsIgnoreCase("Agility")||(type.equalsIgnoreCase("Strength")))
			this.type = type;
	else
		this.type = "Agility";
		
	}
    public void slash() {
    	if (type.equalsIgnoreCase("Agility"))
    		System.out.println("High-speed Slash");
    	else
    		System.out.println("Powerful slash");
    	
    }
    
    public String toString() {
    	return super.toString();
    }
    public void travel() {
  	  System.out.println("You are the Swords, you can Travel with Pegasus");
    }
    public void Defences() {
  	  System.out.println("S: Defences with sheid");
    }
	@Override
	void attack() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void castball() {
		// TODO Auto-generated method stub
		
	}
}
