package FlyweightPattern;

import java.util.HashMap;

public class shapeFactory {
	private static final HashMap<String, circle> circleShape = new HashMap<>();
	
	public static shape getCircle(String colorString) {
		circle circle = circleShape.get(colorString);
		
		if (circle == null) {
			circle = new circle(colorString);
			circleShape.put(colorString, circle);
			System.out.println("Creating circle of color : " + colorString);
		}
		
		return circle;
	}
}
