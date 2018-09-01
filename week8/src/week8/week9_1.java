package week8;
import java.util.*;

public class week9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*String[][] students={
				{"16123","H"},
				{"16123","u"},
		};  */
		
    String[] [] Students =new String[4][2];
    Students[0][0]="16123";
    Students[0][1]="H";
    Students[1][0]="16124";
    Students[1][1]="u";
    Students[2][0]="16125";
    Students[2][1]="I";
    Students[3][0]="16126";
    Students[3][1]="Hui";
    System.out.println(Students[0].length);
			for(int i=0;i<Students.length;i++)
					for(int j=0;j<Students[i].length;j++)
						System.out.println(Students[i][j]); 
	}

}
