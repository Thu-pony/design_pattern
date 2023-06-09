package MenoPattern;

import java.util.ArrayList;
import java.util.List;



public class CareTake {
	private List<Menento> menentoList = new ArrayList<Menento>();
	
	public void add(Menento e) {
		menentoList.add(e);
	}
	
	public Menento get(int index) {
		return menentoList.get(index);
	}
}
