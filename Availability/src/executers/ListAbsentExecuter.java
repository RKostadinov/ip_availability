package executers;
import java.util.ArrayList;

import main.DataHolder;


public class ListAbsentExecuter extends BaseExecuter {

	public ListAbsentExecuter(String[] command, DataHolder dataHolder) {
		super(command, dataHolder);
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
