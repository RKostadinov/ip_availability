package executers;
import java.io.PrintStream;
import java.util.ArrayList;

import main.DataHolder;


public class ListAbsentExecuter extends BaseExecuter {

	public ListAbsentExecuter(String[] command, PrintStream out) {
		super(command, out);
	}

	@Override
	public void execute() {
		if (!currentlyLoggedUsers.contains(command[0])) {
			out.println("error:notlogged");
		} else {
			out.print("ok");
			ArrayList<String> absentUsers = new ArrayList<>(usersToLoginCount.keySet());
			absentUsers.removeAll(currentlyLoggedUsers);
			
			for (String username : absentUsers) {
				out.printf(":%s", username);
			}
		
			out.println();
		}

	}

}
