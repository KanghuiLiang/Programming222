package programming2Week2;

public class CreateAlarm {

	public static void main (String arg[]) {
	     Alarm A1 = new Alarm();
	     Alarm A2 = new Alarm(false, "7:00","Please change the status");
	    
	     A1.checkStatus();
	     System.out.println(A1);
	     A1.AlarmStatus(true);
	     A1.AlarmStatus(false);
	     
	     A2.checkStatus();
	     System.out.println(A2);
	     A2.AlarmStatus(false);
	     A2.AlarmStatus(true);
	}
	
	
	
}

