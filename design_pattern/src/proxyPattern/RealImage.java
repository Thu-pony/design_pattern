package proxyPattern;
public class RealImage implements Image{
	
	String filenameString;
	
	public RealImage(String filenameString) {
		this.filenameString = filenameString;
		LoadFromDisk(filenameString);
	}
	
	public void display() {
		System.out.println("display " + filenameString);
	}
	
	public void LoadFromDisk(String fileString) {
		System.out.println("LoadFromDisk " + filenameString);
	}

}
