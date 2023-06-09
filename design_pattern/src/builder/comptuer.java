package builder;

public class comptuer {
	private String cpu;
	private String ram;
	private int usbCount;
	private String keyboder;
	private String display;
	
	public comptuer(builder builder) {
		this.cpu = builder.cpu;
		this.ram = builder.ram;
		this.keyboder = builder.keyboder;
		this.display = builder.display;
		this.usbCount = builder.usbCount;
	}
	
	public void printInfo() {
		System.out.println("cpu = " + cpu + "\n ram = " + ram + "\n usbCount = " + usbCount + "\n keyboard = " + keyboder + "\n display = " + display);
	}
	public static class builder{
		private String cpu;
		private String ram;
		private int usbCount;
		private String keyboder;
		private String display;
		
		public builder(String cpu, String ram) {
			this.cpu = cpu;
			this.ram = ram;
		}
		public builder setUsbcount(int usbCount) {
			this.usbCount = usbCount;
			return this;
		}
		public builder setKeyboard(String keyBoard) {
			this.keyboder = keyBoard;
			return this;
		}
		public builder setDisplay(String display) {
			this.display = display;
			return this;
		}
		public comptuer build() {
			return new comptuer(this);
		}
	}

}
