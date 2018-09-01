package programming2Week2;

public class makeWeapon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Weapon weapon1= new Weapon("Sniper",3,"Melee");
    Armor A= new Armor("Unknown","No","Maybe");
//    CharacterWeapon Hui = new CharacterWeapon(9,"Huihuihui",weapon1,A);
//    CharacterWeapon Hey = new CharacterWeapon("SAM");
//    System.out.println(Hui);
//    System.out.println(Hey);
//    
    CharacterWeapon maga = new Mage(1000,"Stupid",weapon1,A,"Ice");
    System.out.println(maga);
    ((Mage) maga).castball();
    
//    System.out.println("+++++++");
//    CharacterWeapon swordsmen = new Swordsmen("WhoIam",weapon1,A,"Agility"); //1st
//    Swordsmen sw = new Swordsmen(1,"WhoIam",weapon1,A,"Agility"); //2nd
//    System.out.println(sw);
//    sw.slash();
//    ((Swordsmen) swordsmen).slash();
   
    
//    System.out.println("+++++++");
//    CharacterWeapon men = new Mage("ME");
//    System.out.println(men);

    
//    Mage mage = new Mage(1000,"S",weapon1,A,"Ice");  //will put in array later
//    System.out.println(mage);
//    mage.castball();
      
//    CharacterWeapon[] c = new CharacterWeapon[2];
//    c[0]= new Mage("TestSam");
////    c[0] = mage;  
//    c[1]= new Swordsmen(9999,"IamWhoIam",weapon1,A,"");
//    
//    for(int i=0; i<c.length; i++) {
//    	System.out.println(c[i]);
//    }
   
//   System.out.println("Polymorphism");
   
//    Mage m = new Mage("Mag");
//    Swordsmen s = new Swordsmen("Hi");
    
//     CharacterWeapon m = new Mage("testHui");
//     CharacterWeapon s = new Swordsmen("testSam");
//    
//     m.attack();
//     s.attack();
//     
//     CharacterWeapon[] c = new CharacterWeapon[2];
//   c[0]= new Mage("TestSam");
////   c[0] = mage;  
//   c[1]= new Swordsmen(9999,"IamWhoIam",weapon1,A,"");
//   
//   for(int i=0; i<c.length; i++) {
//   	c[i].attack();
//   }
//  
    
//    CharacterWeapon[] c = new CharacterWeapon[2];
//    c[0]= new Mage("TestSam");
////    c[0] = mage;  
//    c[1]= new Swordsmen(9999,"IamWhoIam",weapon1,A,"");
//    for(int i=0; i<c.length; i++) {
//    	doDefense((Defense) c[i]);
//    }
//    System.out.println();
//
//    for(int i=0; i<c.length; i++) {
//    	doTravel((Travel) c[i]);
//    }
//
//   
//	}
//     public static void doDefense(Defense c) {c.Defense(); }
//
//     public static void doTravel(Travel c) {c.Travel();}
//     
    	 
	}
   }

