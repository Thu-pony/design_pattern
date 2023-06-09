package FacedePattern;

public class shaplefacade{
	shape circleShape;
	shape squareShape;
	shape rectShape;
	
	public shaplefacade() {
		circleShape = new circle();
		squareShape = new square();
		rectShape = new rectangle();
	}
	
	public void drawcircle() {
		circleShape.Draw();
	}
	
	public void drawsquare() {
		squareShape.Draw();
	}
	
	public void drawrect(){
		rectShape.Draw();
	}
	

}
