package bridgePattern;

public class BridgePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape shape1 = new circle();
		shape1.setcolor(new green());
		shape1.draw();
		
		shape shape2 = new square();
		shape2.setcolor(new red());
		shape2.draw();
	}

}
