package proxyPattern;

public class ProxyImage implements Image {
	
	private RealImage realImage;
	private String filenameString;
	
	public ProxyImage(String filenaString) {
		this.filenameString = filenaString;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		if (realImage == null) {
			realImage = new RealImage(filenameString);
		}
		realImage.display();
	}

}
