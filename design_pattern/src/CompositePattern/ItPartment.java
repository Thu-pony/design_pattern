package CompositePattern;

public class ItPartment extends OrganizationComponent {
	
	public ItPartment(String name) {
		super(name);
	}
	
	@Override
	public void Add(OrganizationComponent organization) {
		throw new UnsupportedOperationException(this.getname() + "�Ѿ�����������ţ��޷��������");
	}
	
	@Override
	public int getStaffCount() {
		// TODO Auto-generated method stub
		return 20;
	}
	
	@Override
	public OrganizationComponent getChild(String orgName) {
		if (orgName.equalsIgnoreCase(getname()))
			return this;
		return null;
	}

}
