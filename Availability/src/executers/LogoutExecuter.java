package executers;

import java.io.PrintStream;

import main.DataHolder;

public class LogoutExecuter extends BaseExecuter {

	public LogoutExecuter(String[] command, PrintStream out) {
		super(command, out);
	}

	@Override
	public void execute() {
		if (currentlyLoggedUsers.contains(command[0])) {
			currentlyLoggedUsers.remove(command[0]);
			usersToLoginCount.get(command[0]).afterLogout();
			out.println("ok");
		} else {
			out.println("error:notlogged");
		}
	}
}
