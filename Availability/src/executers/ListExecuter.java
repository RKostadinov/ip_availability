package executers;

import java.io.PrintStream;

import main.DataHolder;

public class ListExecuter extends BaseExecuter {

	public ListExecuter(String[] command, PrintStream out) {
		super(command, out);
	}

	@Override
	public void execute() {
		if (!currentlyLoggedUsers.contains(command[0])) {
			out.println("error:notlogged");
		} else {
			out.print("ok");
			for (String username : currentlyLoggedUsers) {
				out.printf(":%s", username);
			}
			out.println();
		}
	}

}
