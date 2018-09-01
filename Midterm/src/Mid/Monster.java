package Mid;

abstract class Monster {
   protected String Name;
   protected int Health;
   protected int Damage;
   
  public Monster(String Name,int Health, int Damage) {
	  this.Name = Name;
	  this.Health = Health;
	  this.Damage = Damage;
  }
   
 

public String toString() {
	  return "Health: "+ Health +"\nDamage: "+Damage;
  }
  
  abstract int Attack();
  
  public void decreaseHP(int Damage) {
	  setDamage(getDamage()-Damage);
	  if (Health== 0)
		  System.out.println("Monster is dead");
	  else if (Health <0)
		  System.out.println("Why attack dead Monster?");
	  else 
		  System.out.println("You are attacking a Monster!");
  }
  
  
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getHealth() {
	return Health;
}
public void setHealth(int health) {
	Health = health;
}
public int getDamage() {
	return Damage;
}
public void setDamage(int damage) {
	Damage = damage;
}
}
