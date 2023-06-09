package chainResponsiblityPattern;

public class ERRORLOGgger extends AbstractLogger {
	public ERRORLOGgger(int level) {
		this.level = level;
	}
	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("ERROR DEBUG" + message);
	}

}
