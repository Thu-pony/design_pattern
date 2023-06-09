package StatePattern;

public class StopState implements State {
	
	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Player is at stop state");
		context.setState(this);
	}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "stop state";
		}
}
