package CriterialPattern;

public class Person {
	private String name;
	private String gender;
	private String maritalStatus;
	
	public Person(String name, String gender, String maritalStaus) {
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStaus;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public String getMaritalStatus() {
		return this.maritalStatus;
	}
}
