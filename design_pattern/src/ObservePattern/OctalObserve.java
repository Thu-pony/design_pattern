package ObservePattern;

public class OctalObserve extends Observe{
	
	public OctalObserve(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	public void update() {
		System.out.println("Octal Observe " + Integer.toOctalString(subject.getState()));
	}

}
