package executers;


import java.io.PrintStream;
import java.util.List;
import java.util.Map;

import main.DataHolder;
import main.UserInfo;


public abstract class BaseExecuter {
	String[] command;
	List<String> currentlyLoggedUsers;
	Map<String, UserInfo> usersToLoginCount;
	PrintStream out;

	public BaseExecuter(String[] command, PrintStream out) {
		this.command = command;
		DataHolder dataHolder = DataHolder.getInstance();
		
		currentlyLoggedUsers = dataHolder.currentlyLoggedUsers;
		usersToLoginCount = dataHolder.usersToLoginCount;
		this.out = out;
	}

	public void attemptExecute() {	
			execute();
		
		
	}
	public abstract void execute();


}
