import java.util.List;
import java.util.Map;

public class LoginExecuter extends BaseExecuter {

	public LoginExecuter(String[] command, List<String> currentlyLoggedUsers,
			Map<String, Integer> usersToLoginCount) {
		super(command, currentlyLoggedUsers, usersToLoginCount);
	}

	@Override
	public void execute() {
		if (!currentlyLoggedUsers.contains(command[0])) {
			currentlyLoggedUsers.add(command[0]);
		}
		if (usersToLoginCount.get(command[0]) == null) {
			usersToLoginCount.put(command[0], 1);
		} else {
			if (currentlyLoggedUsers.contains(command[0])) {
				Integer temp = usersToLoginCount.get(command[0]);
				temp++;
				System.out.println(temp);
				usersToLoginCount.put(command[0], temp);
			} else {
				usersToLoginCount.put(command[0], 1);
			}
		}
		System.out.println("ok");
	}

}
