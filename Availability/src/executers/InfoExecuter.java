package executers;

import main.DataHolder;
import main.UserInfo;


public class InfoExecuter extends BaseExecuter {

	public InfoExecuter(String[] command, DataHolder dataHolder) {
		super(command, dataHolder);
	}

	@Override
	public void execute() {
		boolean currentlyLogged = false;
		UserInfo userInfo; 
		
		if (!currentlyLoggedUsers.contains(command[0])) {
			System.out.println("error:notlogged");
		}else{
			System.out.print("ok:");
			if(currentlyLoggedUsers.contains(command[2])){
				currentlyLogged = true;
			}
			userInfo = usersToLoginCount.get(command[2]);
			
			System.out.printf("%s:%s:",command[2], Boolean.toString(currentlyLogged));
			userInfo.display();
		}

	}

}
