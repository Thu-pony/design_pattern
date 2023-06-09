package CommandePattern;
//命令的调用者
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock stock = new Stock();
		
		BuyStock buyStock = new BuyStock(stock);
		sellStock sellStock = new sellStock(stock);
		
		invoker invoker = new invoker();
		
		invoker.takeCommand(sellStock);
		invoker.takeCommand(buyStock);
		invoker.takeCommand(buyStock);
		invoker.takeCommand(sellStock);
		
		invoker.placeCommand();
	}

}
