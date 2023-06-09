package StrategyPattern;

public class SubOperation implements Strategy {
	
	@Override
	public int doOperation(int nums1, int nums2) {
		// TODO Auto-generated method stub
		return nums1 - nums2;
	}

}
