package CriterialPattern;

import java.util.ArrayList;
import java.util.List;

public class AndCriterial implements Criterial{
	
	Criterial criterial;
	Criterial otherCriterial;
	
	public AndCriterial(Criterial criterial, Criterial otherCriterial) {
		this.criterial = criterial;
		this.otherCriterial = criterial;
	}
	@Override
	public List<Person> meetCriterial(List<Person> persons) {
		List<Person> mList = new ArrayList<Person>();
		List<Person> mList2 = new ArrayList<Person>();
		mList = criterial.meetCriterial(persons);
		mList2 = otherCriterial.meetCriterial(mList);
		return mList2;
	}

}
