package MenoPattern;

public class Menento {
	private String stateString;
	
	public Menento(String state) {
		this.stateString = state;
	}
	
	public String getStateString() {
		return stateString;
	}
}
