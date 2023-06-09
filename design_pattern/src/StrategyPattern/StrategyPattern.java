package StrategyPattern;

public class StrategyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
		
		Context context1 = new Context(new SubOperation());
		System.out.println("14 - 5 = " + context1.executeStrategy(14, 5));
		
		Context context2 = new Context(new multiOperation());
		
		System.out.println("16 * 3 = " + context2.executeStrategy(16, 3));
		
	}

}
