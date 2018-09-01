package programming2Week2;

public class Armor {
       String ArmorName;
       String pDefense;
       String mDefense;
       
       public Armor(String ArmorName, String pDefense, String mDefense) {
    	   this.ArmorName=ArmorName;
    	   this.pDefense=pDefense;
    	   this.mDefense=mDefense;
    	   
       }
       public String toString() {
    	   return ArmorName +"\nPhysical Defense: "+pDefense+"\nMagical Defense: "+mDefense;
       }

}
