package chainResponsiblityPattern;

public class DebugLogger extends AbstractLogger {
	 
	    public DebugLogger(int level) {
		// TODO Auto-generated constructor stub
	      this.level = level;
	   }
	 
	   @Override
	   protected void write(String message) {    
	      System.out.println("Debug::Logger: " + message);
	   }
	}