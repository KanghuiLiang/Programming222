package practice;

public class Mage extends Character implements Travel, defences {
     String element;
   
     public Mage(int HP,int MP,Weapon Weapon, Armor armor) {
    	 super(HP,MP, Weapon, armor);
    	 this.element = "Fire";
     }
     
     
      public void castball() {
    	 System.out.println("Attack with "+element+" ball");
     }
      
      public String toString() {
    	  String m;
    	  m = "You are the Mage "+super.toString();
    	  return m;
      }
      
	      public void travel() {
	    	  System.out.println("Mage you can Travel with Pegasus");
	      }
	      public void Defences() {
	    	  System.out.println("M: Defences with sheid");
	      }


		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println("ATT");
			
		}


		@Override
		public void slash() {
			// TODO Auto-generated method stub
			
		}
}
