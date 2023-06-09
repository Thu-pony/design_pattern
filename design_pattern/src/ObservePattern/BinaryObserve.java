package ObservePattern;

public class BinaryObserve extends Observe{
	public BinaryObserve(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	public void update() {
		System.out.println("Binary Observe " + Integer.toBinaryString(subject.getState()));
	}
}
