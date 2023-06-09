package VisitPattern;

public class VisitorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerPart computerPart = new Computer();
		computerPart.accept(new CompuerPartDisplay());
				
	}
}
