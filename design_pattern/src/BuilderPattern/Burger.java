package BuilderPattern;

public abstract class Burger implements item {
	@Override
	public Packing pack() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}
	
	@Override
	public abstract float price();
	

}
