package NullPattern;

public class RealCustomer extends AbstractCustorm {
	
	public RealCustomer(String name) {
		this.name = name;
	}
	
	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
