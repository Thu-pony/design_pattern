package CriterialPattern;

import java.util.ArrayList;
import java.util.List;

public class CriterialMale implements Criterial {
	
	@Override
	public List<Person> meetCriterial(List<Person> persons) {
		List<Person> meetCriteriaList = new ArrayList<Person>();
		for (Person person: persons) {
			if (person.getGender().equalsIgnoreCase("MALE")) {
				meetCriteriaList.add(person);
			}
		}
		return meetCriteriaList;
	}

}
