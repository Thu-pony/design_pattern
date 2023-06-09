package factory_pattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//得到circle对象
		shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.Draw();

		//得到rectangle对象
		shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.Draw();
		
		//得到square对象
		shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.Draw();
		
	}

}
