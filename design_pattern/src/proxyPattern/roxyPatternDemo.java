package proxyPattern;

public class roxyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image image = new ProxyImage("10.png");
		//�Ӵ��̼���
		image.display();
		System.out.println();
		image.display();
	}

}
