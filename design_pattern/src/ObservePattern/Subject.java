package ObservePattern;

import java.util.ArrayList;

import CommandePattern.invoker;

public class Subject {
	
	private ArrayList<Observe> observes = new ArrayList<Observe>();
	
	private int state;
	
	public int getState() {
		return this.state;
	}
	
	public void attach(Observe observe) {
		observes.add(observe);
	}
	
	public void setState(int newState) {
		this.state = newState;
	}
	
	public void notifyAllObserve() {
		for (Observe observe: observes) {
			observe.update();
		}
	
	}

}
