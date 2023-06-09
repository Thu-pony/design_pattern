package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class OraganizationCompsite extends OrganizationComponent {
	
	private List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();
	
	public OraganizationCompsite(String name) {
		super(name);
	}
	
	@Override
	public void Add(OrganizationComponent organization) {
		// TODO Auto-generated method stub
		organizationComponents.add(organization);
	}
	
	@Override
	public OrganizationComponent getChild(String orgName) {
		for (OrganizationComponent org: organizationComponents) {
			OrganizationComponent tagOrg = org.getChild(orgName);
			if (tagOrg != null) {
				return tagOrg;
			}
		}
		return null;
	}
	
	 @Override
	public int getStaffCount() {
		int count = 0;
		for (OrganizationComponent org: organizationComponents) {
			count += org.getStaffCount();
		}
		return count;
	}

}
