package practice;

public class Doll_shop_mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doll_shop shop = new doll_shop(null, null, null);
		
//		One way to do array is to assign the vraivable 
		Doll d = new Cat(0, 0, 0, "Cat", 0);
		Doll c = new Dog(0, 0, 0, null, 0);
//		
//		Doll[] list0fDoll = {d,c};
		
		Doll[] listofDoll = new Doll[3];
		listofDoll[0] = new Cat(0, 0, 0, "Cat", 0);
		listofDoll[1] = new Dog(0, 0, 0, null, 0);
		listofDoll[2] = new Robot(0, 0, 0, null, 10);

		doll_shop shop1 = new doll_shop("hui","Sam",listofDoll);
//		for(int i =0; i<shop1.getDoll().length; i++) {
//			System.out.println(shop1.getDoll()[i]);
//		}  for printing the doll
		
//		for(int i =0; i<shop1.getDoll().length; i++) {
//			shop1.getDoll()[i].talk("Buy Me!");
//		}
//		shop1.getdotalk();
	    c.talk(null);
	    d.talk("");
//		shop1.addstock(90);
//		shop1.sell(8);
		
		
//		System.out.println("------");
//		System.out.println(shop1);
		
		
	}

//	public static void dotalk(talkback c) {c.talkBack("talkkk");};
}



//
//the store should contain all type of doll you have created
//
//1. show the list of doll the shop has
//
//
//
//3. let the robot doll use AI system
//
//4. sell 3 toll
//
//5. restock 5 doll
//
//6. show the shop detail