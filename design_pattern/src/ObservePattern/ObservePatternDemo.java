package ObservePattern;



public class ObservePatternDemo {
	
	public static void main(String[] args) {
		Subject subject = new Subject();
		Observe observe1 = new BinaryObserve(subject);
		Observe observe2 = new OctalObserve(subject);
		Observe observe3 = new HexObserve(subject);
		System.out.println("First 12");
		subject.setState(12);
		subject.notifyAllObserve();
		System.out.println("Second 15");
		subject.setState(15);
		subject.notifyAllObserve();
	
		
	}

}
