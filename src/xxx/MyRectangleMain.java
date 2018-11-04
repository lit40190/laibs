package xxx;

public class MyRectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRectangle a = new MyRectangle();
		MyRectangle b = new MyRectangle(10, 20);
		a.setDepth(20);
		a.setWidth(10);
		
		System.out.println(a.getArea());
		System.out.println(b.getArea());

		
	}

}
