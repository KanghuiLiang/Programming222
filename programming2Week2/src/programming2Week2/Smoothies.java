package programming2Week2;
public class Smoothies {
    private int Quantity;
	private int ML;
	private String Fruit;
	private String liquid;
	private Boolean Status;
	private String Time;
	private String Message;
	
	public Smoothies() {
		this.setQuantity(1);
		this.setML(2);
		this.setFruit("Banana");
		this.setLiquid("Milk");
		this.setStatus(true);
		this.setTime("30s");
		this.setMessage("It will be ready.");
	} //default constructor
	
	public Smoothies(int quantity, int ml, String fruit, String water, Boolean n, String time, String message) {
	    this.setQuantity(quantity);
		this.setML(ml);
		this.setFruit(fruit);
		this.setLiquid(water);
		this.setStatus(n);
		this.setTime(time);
		this.setMessage(message);
	}//the second constructor 
	
	
	public void CheckPreparation() {
		System.out.println("Wait for "+this.getTime());
	} //check the waiting time
	
	
	public void SmoothiesReady(Boolean n) {
		if (n==true) 
			System.out.println("Now it is processing. Please wait for " +this.Time);
		else
			System.out.println("Now it is ready, please take it out and make a new one.");
	} //using if else to show different message if there is true or false 
	
	public void addML(int q) {
		System.out.println("Now ML of liquid has been changed to "+q+" ML");
		System.out.println("So now there are " +this.Quantity+" "+this.Fruit+"(s)"+" and "+ q +"ML "+this.liquid+". "+this.Message);
		}

	public String toString() {
		return "There are " +this.Quantity+" "+this.Fruit+"(s)"+" and "+ this.ML+"ML "+this.liquid+". "+this.Message;
	}
	public int getML() {
		return ML;
	}
	public void setML(int ml) {
		ML = ml;
	}
	public String getFruit() {
		return Fruit;
	}
	public void setFruit(String fruit) {
		Fruit = fruit;
	}
	public String getLiquid() {
		return liquid;
	}
	public void setLiquid(String liquid) {
		this.liquid = liquid;
	}
	public Boolean getStatus() {
		return Status;
	}
	public void setStatus(Boolean status) {
		Status = status;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
}
