package VisitPattern;

public class KeyBoard implements ComputerPart {
		public void accept(ComputerPartVisitor compuerpartvisitor) {
			compuerpartvisitor.visit(this);
		};
}
