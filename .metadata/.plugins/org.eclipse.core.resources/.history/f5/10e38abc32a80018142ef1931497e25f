package Mid;

import java.util.*;

public class GamePlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Monster N = new Normal_Monster(null, 0, 0);
       Monster B = new Boss_Monster(null, 0, 0, 0);
       
       Weapon w1 = new Weapon("Swords", 20);
       Weapon w2 = new Weapon("Magic Swords", 30);
       
       Hero H = new Hero();
       Hero H1 = new Hero(w1);
       Hero H2 = new Hero(w2);
       
       Monster[] M = {N,B};
       for(int i =0; i<M.length; i++) {
    	   System.out.println(M[i]);
       }
        
//       Monster[][] a = new Monster[2][2];
//		
//		for(int i=0; i< a.length;i++) {
//			for (int j=0; j<a[i].length; j++) {
//				System.out.println(a[i][j]);
//			}
//		}
       Scanner input = new Scanner(System.in);
        System.out.println("Choose a Hero");
        int k = input.nextInt();
        if (k==1)
        	System.out.println(H);
        else if (k==2)
        	System.out.println(H1);
        else
        	System.out.println(H2);
        
        System.out.println("++++++++++");
        
        System.out.println("Choose the difficulty: easy or difficult");
        String diff = input.nextLine();
        if (diff.equals("easy"))
        	System.out.println(N); 
        else
        	System.out.println(B);
        
       System.out.println("Choose attack Type");
       
       int n = input.nextInt();
       if (n==1)
       	System.out.println(H);
       else if (n==2)
       	System.out.println(H1);
       else
       	System.out.println(H2);
        
        
        
       
	}

}
