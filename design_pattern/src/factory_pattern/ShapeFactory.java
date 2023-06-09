package factory_pattern;

public class ShapeFactory {
	public shape getShape(String type) {
		if (type == null) {
			return null;
		}
		else if (type.equals("CIRCLE")) {
			return new circle();
		}
		else if (type.equals("RECTANGLE")) {
			return new Rectangle();
		}
		else if (type.equals("SQUARE")) {
			return new Square();
		}
		else {
			return null;
		}
	}
}
