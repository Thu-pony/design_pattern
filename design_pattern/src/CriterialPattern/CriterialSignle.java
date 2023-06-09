package CriterialPattern;

import java.util.ArrayList;
import java.util.List;

public class CriterialSignle implements Criterial{
	@Override
	public List<Person> meetCriterial(List<Person> persons) {
		List<Person> mList = new ArrayList<Person>();
		for (Person Person: persons) {
			if (Person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
				mList.add(Person);
			}
		}
		return mList;
	}

}
