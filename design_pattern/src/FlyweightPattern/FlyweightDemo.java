package FlyweightPattern;

public class FlyweightDemo {

	private static final String colors[] = {
			"Red","Grenn","Blue","Black","White"
	};
	public static void main(String[] args) {
		for (int i = 0; i < 20; ++i) {
			circle circle = (circle)shapeFactory.getCircle(getRandomColor());
			circle.setx(getRandomX());
			circle.sety(getRandomY());
			circle.setradius(100);
			circle.Draw();
		}
	}
	
	public static String getRandomColor() {
		return colors[(int)(Math.random() * colors.length)];
	}
	public static int getRandomX() {
		return (int)(Math.random() * 100);
	}
	public static int getRandomY() {
		return (int)(Math.random() * 100);
	}

}
