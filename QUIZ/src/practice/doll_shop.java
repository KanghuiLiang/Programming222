package practice;

import java.util.Arrays;

public class doll_shop {
	private String Name;
	private String Location;
	private Doll[] Doll; //Array????
	private int total_quantity;

	public doll_shop(String Name,String Location,Doll[] Doll) {
		this.Name = Name;
		this.Location =Location;
		this.total_quantity = 0;
		this.Doll = Doll;
//		this.Doll= new String[]{"dog","cat","robot"}; 
	}


	public void seedollList() {}

	public	void seedollDetail(int dollno) {}

	public	void sell(int qty) {
		this.total_quantity -= qty;
	}

	public	void addstock(int qty) {
		this.total_quantity += qty;

		
	}
		
	public String toString() {
			
			String toReturn = "";
			for (int i =0; i< Doll.length;i++) {
				toReturn += Doll[i].toString() + "\n";
			}
			return "Doll shop name: "+Name+"\nLocation: "
			+Location+"\nDoll list:"+toReturn+"\nTotal Quantity:"+total_quantity;		}

			
//			return "Doll shop name: "+Name+"\nLocation: "+Location+"\nDoll list:"+Arrays.toString(Doll)+"\nTotal Quantity:"+total_quantity;		}
		

   

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getLocation() {
			return Location;
		}

		public void setLocation(String location) {
			Location = location;
		}

		public practice.Doll[] getDoll() {
			return Doll;
		}

		public void setDoll(practice.Doll[] doll) {
			Doll = doll;
		}

		public int getTotal_quantity() {
			return total_quantity;
		}

		public void setTotal_quantity(int total_quantity) {
			this.total_quantity = total_quantity;
		}

}
