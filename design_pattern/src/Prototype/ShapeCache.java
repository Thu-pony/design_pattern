package Prototype;

import java.util.Hashtable;

public class ShapeCache {
	private static Hashtable<String, shape> shapetable = new Hashtable<String, shape>();
	
	public static shape getShape(String id) {
		shape cachedShape = shapetable.get(id);
		return cachedShape;
	}
	//对每种形状都运行数据库查询，并创建该形状
	public static void loadcache() {
		circle circle = new circle();
		circle.setid("1");
		shapetable.put(circle.getid(), circle);
		
		rectangle rectangle = new rectangle();
		rectangle.setid("2");
		shapetable.put(rectangle.getid(), rectangle);
		square square = new square();
		square.setid("3");
		shapetable.put(square.getid(), square);
	}
	
}
