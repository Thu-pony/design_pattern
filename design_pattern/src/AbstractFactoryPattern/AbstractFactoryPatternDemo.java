package AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstracFactory abstracFactory1 = FactoryProduce.getFactory("shape");
		AbstracFactory abstracFactory2 = FactoryProduce.getFactory("color");
		
		shape shape1 = abstracFactory1.getShape("CIRCLE");
		shape1.Draw();
		
		shape shape2 = abstracFactory1.getShape("RECTANGLE");
		shape2.Draw();
		
		shape shape3 = abstracFactory1.getShape("SQUARE");
		shape3.Draw();
		
		color color1 = abstracFactory2.getColor("RED");
		color1.fill();
		
		color color2 = abstracFactory2.getColor("GREEN");
		color2.fill();
		
		color color3 = abstracFactory2.getColor("BLUE");
		color3.fill();

	}

}
