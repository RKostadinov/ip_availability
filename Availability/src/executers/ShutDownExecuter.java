package executers;

import main.*;


public class ShutDownExecuter extends BaseExecuter {

	public ShutDownExecuter(String[] command, DataHolder dataHolder) {
		super(command, dataHolder);
	}

	@Override
	public void execute() {
		if (currentlyLoggedUsers.contains(command[0])) {
			System.out.println("ok");
			MainClass.run = false;
		} else {
			System.out.println("error:notlogged");
		}

	}

}
