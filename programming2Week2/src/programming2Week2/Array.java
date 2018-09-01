package programming2Week2;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double[] Bgpa = new double[5]; //bob
	Bgpa[0]=3.5;
	Bgpa[1]=2.75;
	Bgpa[2]=3.21;
	Bgpa[3]=3.8;
	Bgpa[4]=3.32;
	
    double[] Tgpa = {2.5,2.75,2.34,3.09,3.2,3.41,3.21}; //Tina
    
    double bGPAX = 0;
    double tGPAX =0;
    for (int i=0; i<Bgpa.length; i++) {
    	bGPAX+=Bgpa[i];
    }  //get the sum of GPA
    for (int i=0;i<Tgpa.length; i++) {
    	tGPAX+=Tgpa[i];
    }
        bGPAX=bGPAX/(Bgpa.length); //count GPAX
        tGPAX=tGPAX/Tgpa.length;
    System.out.println("Bob's GPAX is " +bGPAX);
    System.out.println("Tina's GPAX is " +tGPAX);

	}

}
