import java.util.List;
import java.util.Map;

public class ListExecuter extends BaseExecuter {

	public ListExecuter(String[] command, List<String> currentlyLoggedUsers,
			Map<String, Integer> usersToLoginCount) {
		super(command, currentlyLoggedUsers, usersToLoginCount);
	}

	@Override
	public void execute() {
		if (!currentlyLoggedUsers.contains(command[0])) {
			System.out.println("error:notlogged");
		} else {
			System.out.print("ok");
			for (String username : currentlyLoggedUsers) {
				System.out.printf(":%s", username);
			}
			System.out.println();
		}
	}

}
