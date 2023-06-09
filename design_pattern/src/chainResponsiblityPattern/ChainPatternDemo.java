package chainResponsiblityPattern;

public class ChainPatternDemo {
	public static AbstractLogger getChianLogger() {
		AbstractLogger errLogger = new ERRORLOGgger(AbstractLogger.ERROR);
		AbstractLogger deLogger = new DebugLogger(AbstractLogger.DEBUG);
		AbstractLogger coAbstractLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errLogger.setNextLogger(deLogger);
		deLogger.setNextLogger(coAbstractLogger);
		return errLogger;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractLogger chainAbstractLogger = getChianLogger();
		
		chainAbstractLogger.logMessage(AbstractLogger.INFO, "this is a info");
		
		System.out.println();
		
		chainAbstractLogger.logMessage(AbstractLogger.DEBUG, "this is a debug");
		
		System.out.println();
		
		chainAbstractLogger.logMessage(AbstractLogger.ERROR, "this is a error");
	}

}
