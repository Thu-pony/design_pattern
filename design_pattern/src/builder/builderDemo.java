package builder;

public class builderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comptuer comptuer = new comptuer.builder("Intel", "Samsung")
				                .setDisplay("��˶")
				                .setUsbcount(5)
				                .build();
		comptuer.printInfo();

	}

}
