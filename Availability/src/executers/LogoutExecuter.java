package executers;

import main.DataHolder;

public class LogoutExecuter extends BaseExecuter {

	public LogoutExecuter(String[] command, DataHolder dataHolder) {
		super(command, dataHolder);
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
