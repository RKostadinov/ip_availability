package executers;
import java.util.List;
import java.util.Map;


public abstract class BaseExecuter {
	String[] command;
	List<String> currentlyLoggedUsers;
	Map<String, Integer> usersToLoginCount;


	public BaseExecuter(String[] command, List<String> currentlyLoggedUsers, Map<String, Integer> usersToLoginCount) {
		this.command = command;
		this.currentlyLoggedUsers = currentlyLoggedUsers;
		this.usersToLoginCount = usersToLoginCount;
	}

	public void attemptExecute() {	
			execute();
		
		
	}
	public abstract void execute();


}
