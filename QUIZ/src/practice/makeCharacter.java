package practice;

public class makeCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon w1 = new Weapon("tEST",1000,"test");
		Weapon w2 = new Weapon("Type");
		Armor a1 = new Armor ("SK","o");
		
//        Character C1 = new Character(w2);
//        Character C2 = new Character(w1);
//        Character C3 = new Character(10000,10000,w1,a1);
        Character C4 = new Mage(1,1,w1,a1);
        Character C5 = new Swordsmen(w1,"s");
          C4.attack();
//        C5.slash();
//        System.out.println(C4);
        
//        System.out.println(C1.MP); //when int HP is private in Character class. it will be error to print 
//        System.out.println(Character.call);
//        System.out.println(C1.call);  //also works
//        System.out.println(Character.MP);  //error 
//        System.out.println(C1); //without toString() method in Character class, it will print the memory 
//        System.out.println(C3);        
//        System.out.println(C2);
//           C4.castball(); //in superclass also needed 
//        
         Character [] C = new Character[2];
         C[0] = new Mage(999999999, 0, w2, a1);
         C[1] = new Swordsmen(w2,"rrrr");
//         
//         for (int i =0; i < C.length; i++) {
//        	 System.out.println(C[i]);
//         }    //loop to print 
          
//           ((Mage) C4).travel();
	}
           
           public static void doDefense(defences c) {c.Defences(); }

           public static void doTravel(Travel c) {c.travel();}   //for implementation
           
	}


