
public class homework7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My course list");
		String[] myCourselist = {"ITE221-Programming 1","ITE222-Programming 2","ITE321-SAD&Implementation",
				"ITE223-Application Development","MIS103-Computer Application"};
		 //String[] myCourselist= new String[5];
		/* myCourselist[0] ="ITE221-Programming 1";
		 myCourselist[1] = "ITE222-Programming 2";
		 myCourselist[2] = "ITE321-SAD&Implementation";
		 myCourselist[3] = "ITE223-Application Development";
		 myCourselist[4] = "MIS103-Computer Application";*/ //This is another way to do
		 for (int i= 0; i <myCourselist.length; i++) {
			 System.out.println(myCourselist[i]);
		 }
	}

}
