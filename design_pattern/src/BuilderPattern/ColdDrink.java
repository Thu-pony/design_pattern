package BuilderPattern;

public abstract class ColdDrink implements item{
	@Override
	public Packing pack() {
		// TODO Auto-generated method stub
		return new Bottle();
	}
	
	@Override
	public abstract float price();
	

}
