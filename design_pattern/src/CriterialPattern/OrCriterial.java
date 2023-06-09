package CriterialPattern;

import java.util.ArrayList;
import java.util.List;

public class OrCriterial implements Criterial{
	Criterial criterial;
	Criterial otherCriterial;
	
	public OrCriterial(Criterial criterial, Criterial otherCriterial) {
		this.criterial = criterial;
		this.otherCriterial = otherCriterial;
	}
	@Override
	public List<Person> meetCriterial(List<Person> persons) {
		List<Person> mList = new ArrayList<Person>();
		List<Person> mList2 = new ArrayList<Person>();
		mList = criterial.meetCriterial(persons);
		mList2 = otherCriterial.meetCriterial(persons);
		for (Person person: mList2) {
			if (!mList.contains(persons)) {
				mList.add(person);
			}
		}
		return mList;
	}

}
