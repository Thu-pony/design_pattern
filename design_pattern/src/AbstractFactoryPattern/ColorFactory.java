package AbstractFactoryPattern;

public class ColorFactory extends AbstracFactory {
	public color getColor(String type) {
		if (type == null) {
			return null;
		}
		else if (type.equals("RED")) {
			return new red();
		}
		else if (type.equals("GREEN")) {
			return new green();
		}
		else if (type.equals("BLUE")) {
			return new blue();
		}
		else {
			return null;
		}
	}
	@Override
	public shape getShape(String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
