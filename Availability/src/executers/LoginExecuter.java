package executers;

import main.DataHolder;
import main.UserInfo;

public class LoginExecuter extends BaseExecuter {

	public LoginExecuter(String[] command, DataHolder dataHolder) {
		super(command, dataHolder);
	}

	@Override
	public void execute() {

//		first login
		if (usersToLoginCount.get(command[0]) == null) {
			usersToLoginCount.put(command[0], new UserInfo());
		} else {
			if (!currentlyLoggedUsers.contains(command[0])) {
				usersToLoginCount.get(command[0]).afterLogin();
			}else{
//				Already logged
			}	
		}
		if (!currentlyLoggedUsers.contains(command[0])) {
			currentlyLoggedUsers.add(command[0]);
		}
		System.out.println("ok");
	}

}
