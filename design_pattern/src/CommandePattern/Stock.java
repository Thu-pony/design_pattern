package CommandePattern;
//command receiver //����ľ���ִ����
public class Stock {

	private String nameString = "ABC";
	private int quantity = 10;
	
	public void buy() {
		System.out.println("buy socket " + nameString + " the number " + quantity);
	}
	
	public void sell() {
		System.out.println("sell socket " + nameString + " the number " + quantity);
	}
}
