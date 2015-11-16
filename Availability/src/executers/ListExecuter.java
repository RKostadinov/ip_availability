package executers;

import main.DataHolder;

public class ListExecuter extends BaseExecuter {

	public ListExecuter(String[] command, DataHolder dataHolder) {
		super(command, dataHolder);
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
