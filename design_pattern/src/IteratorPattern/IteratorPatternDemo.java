package IteratorPattern;

public class IteratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameRepository nameRepository = new NameRepository();
		
		for (iterator iterator = nameRepository.getIterator(); iterator.hasnext();) {
			String nameString = (String)iterator.next();
			System.out.println("name = " + nameString);
		}
	}

}
