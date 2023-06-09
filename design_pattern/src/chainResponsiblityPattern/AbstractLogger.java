package chainResponsiblityPattern;

public abstract class AbstractLogger {
	private AbstractLogger nextLogger;
	
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	protected int level;
	public void setNextLogger(AbstractLogger nextAbstractLogger) {
		this.nextLogger = nextAbstractLogger;
	}
	
	public void logMessage(int level, String message) {
		if (this.level <= level) {
			write(message);
		}
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}
	
	
	abstract protected void write(String message);
}
