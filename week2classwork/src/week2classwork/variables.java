package week2classwork;

public class variables {

	public static void main(String[] args) {
	    int owns=2;
	    String brand="BMW";
	    String model="X6";
	    double speed=110.5;
	    System.out.println("I owned "+owns+" cars.My favorite car is "+brand+" "+model+". I normally drive with the speed of "+speed+"km/hr");
		
	    
	    int a=5;
		double b=10.55;
		String d="23";
        char e='a'; //binary at 97
        String f="5";
        String g="4";
        char h='5';//binary at 53
        //Use variable only to print out the following text for each statement above to print out.
   
        System.out.println(a+a);//10
        System.out.println(a+b);//15.55
        System.out.println(a+e);//102
        System.out.println(e+a);//102
        System.out.println(g+b);//410.55
        System.out.println(a+a+f);//105
        System.out.println(a+a+h);//63
}
}