package executers;


import java.util.List;
import java.util.Map;

import main.DataHolder;


public abstract class BaseExecuter {
	String[] command;
	List<String> currentlyLoggedUsers;
	Map<String, Integer> usersToLoginCount;


	public BaseExecuter(String[] command, DataHolder dataHolder) {
		this.command = command;
		currentlyLoggedUsers = dataHolder.currentlyLoggedUsers;
		usersToLoginCount = dataHolder.usersToLoginCount;
	}

	public void attemptExecute() {	
			execute();
		
		
	}
	public abstract void execute();


}
