package MediatorPattern;

public class User {
	private String nameString;
	
	public void setName(String name) {
		this.nameString = name;
	}
	
	public String getName() {
		return nameString;
	}
	
	public User(String name) {
		this.nameString = name;
	}
	
	public void sendMessage(String message) {
		Chatroom.showMessage(this, message);
	}
}
