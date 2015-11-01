import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CommandsHandler {
	static List<String> currentlyLoggedUsers = new LinkedList<String>();
	static Map<String, Integer> usersToLoginCount = new HashMap<String, Integer>();

	public static void execute(String command) {

		BaseExecuter baseExecuter = null;
		String[] split = command.split(":");

		if (split.length < 2) {
			System.out.println("error:unknowncommand");
		}

		switch (split[1]) {
		case "login":
			baseExecuter = new LoginExecuter(split, currentlyLoggedUsers,
					usersToLoginCount);
			break;
		case "logout":
			baseExecuter = new LogoutExecuter(split, currentlyLoggedUsers,
					usersToLoginCount);
			break;
		case "info":
			baseExecuter = new InfoExecuter(split, currentlyLoggedUsers,
					usersToLoginCount);
			break;
		case "listavailable":
			baseExecuter = new ListExecuter(split, currentlyLoggedUsers,
					usersToLoginCount);
			break;
		case "shutdown":
			baseExecuter = new ShutDownExecuter(split, currentlyLoggedUsers,
					usersToLoginCount);
			break;
		default:
			System.out.println("error:unknowncommand");
			break;
		}

		if (baseExecuter != null)
			baseExecuter.attemptExecute();
	}
}
