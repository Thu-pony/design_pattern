package adapter;

public class adapterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lowDebug lowDebug = new  adapter(new highDebugImp());
		lowDebug.debug(1, "test");
	}

}
