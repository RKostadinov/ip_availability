package executers;

import java.io.PrintStream;
import main.ClientHandler;

public class LogoutExecuter extends BaseExecuter {
	ClientHandler clientHandler;
	public LogoutExecuter(String[] command, PrintStream out, ClientHandler clientHandler) {
		super(command, out);
		this.clientHandler = clientHandler;
		}

	@Override
	public void execute() {
		if (currentlyLoggedUsers.contains(command[0])) {
			currentlyLoggedUsers.remove(command[0]);
			usersToLoginCount.get(command[0]).afterLogout();
			clientHandler.setLogged(false);
			out.println("ok");
		} else {
			out.println("error:notlogged");
		}
	}
}
