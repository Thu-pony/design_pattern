package AbstractFactoryPattern;

public abstract class AbstracFactory {
	public abstract shape getShape(String type);
	public abstract color getColor(String type);

}
