package MediatorPattern;

import java.awt.image.DataBufferByte;
import java.util.Date;

import org.w3c.dom.UserDataHandler;



public class Chatroom {
	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " " + user.getName() + " : " + message);
		
	}

}
