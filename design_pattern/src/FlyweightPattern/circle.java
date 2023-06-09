package FlyweightPattern;

public class circle implements shape{
	private String colorString;
	private int x;
	private int y;
	private int radius;
	
	public circle(String colString) {
		this.colorString = colString;
	}
	
	public void setx(int x) {
		this.x = x;
	}
	
	public void sety(int y) {
		this.y = y;
	}
	
	public void setradius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle Draw() " + x + " = x y = " + y + " radius = " + radius);
	}
}
