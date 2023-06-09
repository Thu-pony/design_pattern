package StrategyPattern;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy(int nuums1, int nums2) {
		return strategy.doOperation(nuums1, nums2);
	}
}
