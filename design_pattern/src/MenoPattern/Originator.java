package MenoPattern;

public class Originator {
	private String stateString;
	
	public void setState(String state) {
		stateString = state;
	}
	public String getState() {
		return stateString;
	}
	
	public Menento saveStateToMenento() {
		return new Menento(stateString);
	}
	
	public void getStateFromMemeto(Menento menento) {
		stateString = menento.getStateString();
	}
}
