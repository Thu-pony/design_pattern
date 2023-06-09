package Prototype;

public class shape {
	String id;
	String type;
	
	void setid(String id) {
		this.id = id;
	}
	String getid() {
		return this.id;
	}
	
	void settype(String type) {
		this.type = type;
	}
	
	String gettype() {
		return this.type;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object clone = null;
		try {
			clone =super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
		}
		return clone;
	}
}
