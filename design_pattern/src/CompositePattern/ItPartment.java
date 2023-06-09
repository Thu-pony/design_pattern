package CompositePattern;

public class ItPartment extends OrganizationComponent {
	
	public ItPartment(String name) {
		super(name);
	}
	
	@Override
	public void Add(OrganizationComponent organization) {
		throw new UnsupportedOperationException(this.getname() + "已经是最基本部门，无法再添加了");
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
