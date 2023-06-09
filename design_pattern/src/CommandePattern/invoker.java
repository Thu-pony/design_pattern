package CommandePattern;
//命令的调用者

import java.util.ArrayList;
import java.util.List;

public class invoker {
	private List<Command> listcCommands = new ArrayList<>();
	
	public void takeCommand(Command command) {
		listcCommands.add(command);
	}
	public void placeCommand() {
		for (Command com: listcCommands ) {
			com.execute();
		}
		listcCommands.clear();
	}
}
