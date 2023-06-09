package Prototype;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeCache.loadcache();
		
		shape cloShape1 = (shape)ShapeCache.getShape("1");
		System.out.println("Shape: " + cloShape1.gettype());
		
		shape cloShape2 = (shape)ShapeCache.getShape("2");
		System.out.println("Shape: " + cloShape2.gettype());
		
		shape cloShape3 = (shape)ShapeCache.getShape("3");
		System.out.println("Shape: " + cloShape3.gettype());
	}

}
