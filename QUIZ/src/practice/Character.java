package practice;

abstract class Character {
  private Weapon weapon;
  protected int MP;
  protected int HP;
  public Armor armor;
  
  public static String call ="you"; //where to call...
  
  public Character() {
	  this.MP =100;
	  this.HP =100;
	  this.armor = new Armor();
	  this.weapon = new Weapon("T");
  }
  
  
  public Character(int MP, int HP, Weapon weapon, Armor armor) {
	  this.MP = MP;
	  this.HP = HP;
	  this.weapon =weapon;
	  this.armor = armor;
  }
  
  public Character(Weapon weapon){
	  this.MP = 10;
	  this.HP = 10;
	  this.weapon = weapon;
  }
  
  
  
  public void heal(int hp) {
	  this.HP = hp;
	  this.MP = 10;
  }
  
  public int getHP() {return HP;} //Return: let other method do your work and return your result
  public void setHP(int HP) {this.HP = HP;} //use get/set access to private data member 
  
  abstract void attack();
  
  public String toString() {
	  return "MP: "+MP+"\nHp: "+HP+"\n"+weapon+"\n"+armor;
  }  //to be used to print character in main class

public Weapon getWeapon() {
	return weapon;
}

public void setWeapon(Weapon weapon) {
	this.weapon = weapon;
}


abstract public void castball();


abstract public void slash();

  
  
}
