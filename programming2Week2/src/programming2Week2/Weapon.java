package programming2Week2;

public class Weapon {
	private String WeaponName;
            int Damage;
	private String Type;
	
   public Weapon(String name, int damage, String type){
	   this.WeaponName=name;
	   this.Damage = damage;
	   if (type.equalsIgnoreCase("Melee")||type.equalsIgnoreCase("Range"))
	   this.Type = type;
	   else 
		   this.Type="Range";
		   
   }
   
   public String toString() {
	   return "Name: "+WeaponName+"\nDamage: "+Damage+"\nType: "+Type;
   }
   
  
	
	
}
