package executers;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class ListAbsentExecuter extends BaseExecuter {

	public ListAbsentExecuter(String[] command,
			List<String> currentlyLoggedUsers,
			Map<String, Integer> usersToLoginCount) {
		super(command, currentlyLoggedUsers, usersToLoginCount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		if (!currentlyLoggedUsers.contains(command[0])) {
			System.out.println("error:notlogged");
		} else {
			System.out.print("ok");
			ArrayList<String> absentUsers = new ArrayList<>(usersToLoginCount.keySet());
			absentUsers.removeAll(currentlyLoggedUsers);
			
			for (String username : absentUsers) {
				System.out.printf(":%s", username);
			}
		
			System.out.println();
		}

	}

}
