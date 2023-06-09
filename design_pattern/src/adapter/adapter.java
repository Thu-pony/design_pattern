package adapter;

public class adapter implements lowDebug {
	private highDebug highDebug;
	
	public adapter(highDebug highDebug) {
		this.highDebug = highDebug;
	}
	@Override
	public void debug(int tag, String info) {
		// TODO Auto-generated method stub
		highDebug.debug(1, info, info);
	}

}
