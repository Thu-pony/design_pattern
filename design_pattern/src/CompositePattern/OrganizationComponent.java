package CompositePattern;



public abstract class OrganizationComponent {
	private String name;
	
	public OrganizationComponent(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	
	public abstract void Add(OrganizationComponent organization);
	public abstract OrganizationComponent getChild(String orgName);
	public abstract int getStaffCount();
	
	public String toString() {
		return name;
	}
}
