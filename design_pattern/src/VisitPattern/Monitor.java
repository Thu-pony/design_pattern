package VisitPattern;

public class Monitor implements ComputerPart {@Override
public void accept(ComputerPartVisitor compuerpartvisitor) {
	// TODO Auto-generated method stub
	compuerpartvisitor.visit(this);
}
}
