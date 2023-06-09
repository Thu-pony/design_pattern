package AbstractFactoryPattern;

public class FactoryProduce {
	public static AbstracFactory getFactory(String type) {
		if (type.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		}
		else if (type.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		else {
			return null;
		}
	}

}
