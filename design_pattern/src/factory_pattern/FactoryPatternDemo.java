package factory_pattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//�õ�circle����
		shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.Draw();

		//�õ�rectangle����
		shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.Draw();
		
		//�õ�square����
		shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.Draw();
		
	}

}
