package xxx;

public class MyRectangle {

	double depth, width;
	
	public MyRectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public MyRectangle(double width, double depth) {
		// TODO Auto-generated constructor stub
		this();
		this.width = width;
		this.depth = depth;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public double getArea() {
		
		return this.width*this.depth;
	}

}
