package CriterialPattern;

import java.util.ArrayList;
import java.util.List;

public class CriterialFemale implements Criterial {
	
	@Override
	public List<Person> meetCriterial(List<Person> persons) {
		List<Person> mList = new ArrayList<Person>();
		for (Person person: persons) {
			if (person.getGender().equalsIgnoreCase("FEMALE")) {
				mList.add(person);
			}
		}
		return mList;
	}

}
