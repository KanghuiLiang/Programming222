package practice;

abstract class Doll {
	private int size_cm;
	private int weight;
	private int height;
	private String Species;
	private Double price;
	
	public Doll(int s, int w, int h,String t,double p) {
		this.size_cm =s;
		this.weight = w;
		this.height=h;
		this.Species =t;
		this.price =p;
	}
	abstract void talk(String sentence);
	
	abstract void walk(int distance);
	
	public String toString() {
		return "\nSize: "+size_cm +"\nweight: "+weight +"\nHeight: "+height+"\nSpecies: "+Species+"\nprice: "+price;
	} 
	
	
	public int getSize_cm() {
		return size_cm;
	}
	public void setSize_cm(int size_cm) {
		this.size_cm = size_cm;
	}
	public int getWeight() {
		return weight;
	}
	public void setWright(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getSpecies() {
		return Species;
	}
	public void setSpecies(String species) {
		Species = species;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	

}
