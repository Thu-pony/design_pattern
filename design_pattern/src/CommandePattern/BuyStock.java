package CommandePattern;
//æﬂÃÂ√¸¡Ó

public class BuyStock implements Command {

	private Stock acbStock;
	
	public BuyStock(Stock stock) {
		this.acbStock = stock;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		acbStock.buy();
	}

}
