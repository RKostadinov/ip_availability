package executers;

import main.DataHolder;

public class LoginExecuter extends BaseExecuter {

	public LoginExecuter(String[] command, DataHolder dataHolder) {
		super(command, dataHolder);
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
				usersToLoginCount.put(command[0], temp);
			} else {
				usersToLoginCount.put(command[0], 1);
			}
		}
		System.out.println("ok");
	}

}
