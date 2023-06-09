package VisitPattern;

public class CompuerPartDisplay implements ComputerPartVisitor {
	
	@Override
	public void visit(Computer computer) {
		// TODO Auto-generated method stub
		System.out.println("visit compurt");
	}
	
	@Override
	public void visit(KeyBoard keyBoard) {
		// TODO Auto-generated method stub
		System.out.println("visit KyeBoard");
	}
	
	@Override
	public void visit(Monitor monitor) {
		// TODO Auto-generated method stub
		System.out.println("visit monitor");
	}
	@Override
	public void visit(Mouse mouse) {
		// TODO Auto-generated method stub
		System.out.println("visit mouse");
	}
}
