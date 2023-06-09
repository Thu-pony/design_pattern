package MenoPattern;

public class MenoPatternDemo {
	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTake careTake = new CareTake();
		originator.setState("State #1");
		careTake.add(originator.saveStateToMenento());
		originator.setState("State #2");
		originator.setState("State #3");
		careTake.add(originator.saveStateToMenento());
		originator.setState("State #4");
		System.out.println("Current State: " + originator.getState());
		originator.getStateFromMemeto(careTake.get(0));
		System.out.println("First save: " + originator.getState());
		originator.getStateFromMemeto(careTake.get(1));
		System.out.println("Second save: " + originator.getState());
	}
}
