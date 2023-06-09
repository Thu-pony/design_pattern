package VisitPattern;

public class Mouse implements ComputerPart {
	public void accept(ComputerPartVisitor compuerpartvisitor) {
		compuerpartvisitor.visit(this);
	};
}
