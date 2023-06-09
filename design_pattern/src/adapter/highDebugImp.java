package adapter;

public class highDebugImp implements highDebug {
		@Override
		public void debug(int priority, String message, Object object) {
			// TODO Auto-generated method stub
			System.out.println("This is a high debug " +  priority + " " + message);
		}
}
