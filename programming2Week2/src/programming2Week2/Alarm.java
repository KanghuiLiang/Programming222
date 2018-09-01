package programming2Week2;

     public class Alarm {
     
     private boolean AlarmStatus;
     private String AlarmTime;
     private String AlarmMessage;
     
     
     public Alarm() {
    	 this.setAlarmStatus(true);
    	 this.setAlarmTime("5:00 ");
    	 this.setAlarmMessage("Alarm is ON.");
     }  //default alarm
        //first constructor 
     
     public Alarm(boolean status, String time, String message ) {
    	this.setAlarmStatus(status);
    	this.setAlarmTime(time);
    	this.setAlarmMessage(message); //why we are using 'this'
     }  //second constructor 
   
//     public Alarm(boolean status, String time) {
//    	 this.setAlarmStatus(status);
//    	 this.setAlarmTime(time);
//     }  //another constructor
     
     
     public void checkStatus() {
    	    System.out.println("Alarm Status: "+this.isAlarmStatus()+"\n");
     }
     
     public void AlarmStatus(boolean n) {
      if (n == AlarmStatus ){
    	  if(n) {
    		  System.out.println("Alarm is already ON \n");
    	  }else {
    		  System.out.println("Alarm is already OFF \n");
    	  }
      }else if(n==true)
       System.out.println("Alarm was OFF. Now it is ON \n");
      else
       System.out.println("Alarm Was ON. Now it is OFF \n"); 
       this.setAlarmStatus(n); 
     }
     
     public String toString() {
    	 return "++++++++++\nALARM INFORMATION \nStatus: "+AlarmStatus+"\nTime:"+AlarmTime+"\nMessage: "+AlarmMessage+"\n++++++++++";
     }
	public boolean isAlarmStatus() {
		return AlarmStatus;
	}

	public void setAlarmStatus(boolean alarmStatus) {
		AlarmStatus = alarmStatus;
	}

	public String getAlarmTime() {
		return AlarmTime;
	}

	public void setAlarmTime(String alarmTime) {
		AlarmTime = alarmTime;
	}

	public String getAlarmMessage() {
		return AlarmMessage;
	}

	public void setAlarmMessage(String alarmMessage) {
		AlarmMessage = alarmMessage;
	}
     
   }
