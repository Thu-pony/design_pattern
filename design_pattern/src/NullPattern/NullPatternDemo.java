package NullPattern;

public class NullPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractCustorm abstractCustorm1 = CustormFactory.getCustorm("Rob");
		AbstractCustorm abstractCustorm2 = CustormFactory.getCustorm("neil");
		AbstractCustorm abstractCustorm3 = CustormFactory.getCustorm("Joe");
		AbstractCustorm abstractCustorm4 = CustormFactory.getCustorm("Julie");
		AbstractCustorm abstractCustorm5 = CustormFactory.getCustorm("shiny");
		System.out.println("custormers");
		
		System.out.println(abstractCustorm1.getName());
		System.out.println(abstractCustorm2.getName());
		System.out.println(abstractCustorm3.getName());
		System.out.println(abstractCustorm4.getName());
		System.out.println(abstractCustorm5.getName());
	}

}
