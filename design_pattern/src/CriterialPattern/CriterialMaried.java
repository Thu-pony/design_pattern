package CriterialPattern;

import java.util.ArrayList;
import java.util.List;

import bridgePattern.red;

public class CriterialMaried implements Criterial{
	
	@Override
	public List<Person> meetCriterial(List<Person> persons) {
		List<Person> mList = new ArrayList<Person>();
		for (Person person: persons) {
			if (person.getMaritalStatus().equalsIgnoreCase("MARRIED")) {
				mList.add(person);
			}
		}
		return mList;
	}

}
