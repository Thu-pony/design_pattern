package IteratorPattern;

public class NameRepository implements Contanier{
	
	public String names[] = {"Trumph", "Biden", "Obama", "Bush", "Leon"};
	
	@Override
	public iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}

	private class NameIterator implements iterator {
		int index;
		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if (this.hasnext())return names[index++];
			return null;
		}
		@Override
		public boolean hasnext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}
	}

}
