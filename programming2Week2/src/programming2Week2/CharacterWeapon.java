package programming2Week2;

abstract class CharacterWeapon {
	 Weapon weapon; 
	 int hp;
	 String name;
	 Armor armor;
	 
	
   public CharacterWeapon(int hp,String name, Weapon weapon, Armor armor) {
	   this.hp=hp;
	   this.name = name;
	   this.weapon = weapon;
	   this.armor = armor;
   }
  
   public CharacterWeapon(String name) {
	   this.name=name;
	   this.armor=new Armor("Mengu","No","No");
	   this.weapon= new Weapon("Gun",100,"Range");
   }
	
   
    public  String toString() {
    	return "Name: "+name+"\nHP: "+hp+"\nAmor: "+armor+"\nWeapon "+weapon+"\n";
    }
    
    abstract public void attack();

}
