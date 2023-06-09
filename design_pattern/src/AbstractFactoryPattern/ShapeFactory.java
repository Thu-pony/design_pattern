package AbstractFactoryPattern;

public class ShapeFactory extends AbstracFactory{
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
	@Override
	public color getColor(String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
