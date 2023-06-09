package MediatorPattern;

public class MediaPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User("Biden");
		User user2 = new User("Putin");
		
		user2.sendMessage("I will insult ukarine");
		user1.sendMessage("I will defend it");
	}

}
