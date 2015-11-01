import java.util.List;
import java.util.Map;

public class LogoutExecuter extends BaseExecuter {

	public LogoutExecuter(String[] command, List<String> currentlyLoggedUsers,
			Map<String, Integer> usersToLoginCount) {
		super(command, currentlyLoggedUsers, usersToLoginCount);
	}

	@Override
	public void execute() {
		if (currentlyLoggedUsers.contains(command[0])) {
			currentlyLoggedUsers.remove(command[0]);
			System.out.println("ok");
		} else {
			System.out.println("error:notlogged");
		}
	}
}
