package bridgePattern;

public abstract class shape {
	public color color;
	
	public void setcolor(color color) {
		this.color = color;
	}
	public abstract void draw();

}
