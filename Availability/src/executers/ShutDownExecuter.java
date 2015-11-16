package executers;
import java.util.List;
import java.util.Map;

import main.MainClass;

public class ShutDownExecuter extends BaseExecuter {

	public ShutDownExecuter(String[] command,
			List<String> currentlyLoggedUsers,
			Map<String, Integer> usersToLoginCount) {
		super(command, currentlyLoggedUsers, usersToLoginCount);
	}

	@Override
	public void execute() {
		if (currentlyLoggedUsers.contains(command[0])) {
			System.out.println("ok");
			MainClass.run = false;
		} else {
			System.out.println("error:notlogged");
		}

	}

}
