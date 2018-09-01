package Mid;

public class Hero implements Skill{
	private int Health;
	private Weapon weapon;
	private int Armor;
	private int Damage;
	private int Mana;
	private String Name;
	
	public Hero(String Name) {
		this.Name = Name;
		this.weapon = null;
		this.Armor= 0;
		this.Damage=20;
		this.Mana = 100;
		this.Health = 100;	
	}
	
	public Hero(Weapon weapon) {
		this.weapon = weapon;
		this.Armor= 0;
		this.Damage=20;
		this.Mana = 100;
		this.Health = 100;	
	}
	
  public int Attack() {
	  if (weapon.equals(weapon)) {
     System.out.println("Attack with Punch damage");
	  return Damage;
	  }
	  else {
    System.out.println("Attack with " + weapon);
		  return  Damage;
	  }
  }
  
     public void decreaseHP(int damage) {
    	 setDamage(getDamage()-damage);
    	 if (Armor ==0) {
    		 System.out.println("LOSER!");
    	 }
       }
    
     public String toString() {
    	 
    	 return "Hero: "+Name+"\nHealth: "+Health +"\nArmor: "+Armor+"\nMana: "+Mana+"\n"+"Weapon: " +weapon
    			 +"\nTotal Damage: "+ Damage;
     }
	
     public void changeWp(Weapon weapon) {
    	 this.weapon = weapon;
     }

	@Override
	public int Physical_skill() {
		// TODO Auto-generated method stub
		System.out.println("Hero Attack with physical skill"+Damage*1.5);
		return Damage;
	}

	@Override
	public int Magic_Skill(int mana) {
		// TODO Auto-generated method stub
		if (mana<=0) {
			System.out.println("Not enough mana");
			return mana = 0;
		}
		else {
			System.out.println("Hero Attack with magic skill!");  
		 return Damage;
		}
		}
	

	
	public int getDamage() {
		return Damage;
	}

	public int getHealth() {
		return Health;
	}

	public void setHealth(int health) {
		Health = health;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public int getArmor() {
		return Armor;
//		 if (Armor <0) {
//    		 return 0;
//    	 }
	}

	public void setArmor(int armor) {
		Armor = armor;
		
	}

	public int getMana() {
		return Mana;
	}

	public void setMana(int mana) {
		Mana = mana;
	}

	public void setDamage(int damage) {
		Damage = damage;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	
}
