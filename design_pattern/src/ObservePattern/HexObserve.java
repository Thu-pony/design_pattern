package ObservePattern;

public class HexObserve extends Observe {
	
	public HexObserve(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	public void update() {
		System.out.println("Hex Observe " + Integer.toHexString(subject.getState()));
	}

}
