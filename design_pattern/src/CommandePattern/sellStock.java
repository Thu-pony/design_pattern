package CommandePattern;

//æﬂÃÂ√¸¡Ó
public class sellStock implements Command{
	
	private Stock abcStock;
	
	public sellStock(Stock stock) {
		this.abcStock = stock;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		abcStock.sell();
	}

}
