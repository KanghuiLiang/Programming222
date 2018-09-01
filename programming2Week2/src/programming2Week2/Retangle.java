package programming2Week2;

public class Retangle {
	  private point coordinate;
	  private int width;
	  private int height;
	 
	 Retangle(){
		 width =0;
		 height = 0;
		 coordinate =new point(1,2);
	}
	 
	Retangle(int x, int y, int w, int h){
		width=w;
		height=h;
		coordinate = new point(x,y);
	}
	
	void showlocation() {
		System.out.println(coordinate);
	}

}
