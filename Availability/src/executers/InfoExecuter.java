package executers;

import main.DataHolder;


public class InfoExecuter extends BaseExecuter {

	public InfoExecuter(String[] command, DataHolder dataHolder) {
		super(command, dataHolder);
	}

	@Override
	public void execute() {
		boolean currentlyLogged = false;
		Integer logincount = 0; 
		
		if (!currentlyLoggedUsers.contains(command[0])) {
			System.out.println("error:notlogged");
		}else{
			System.out.print("ok:");
			if(currentlyLoggedUsers.contains(command[2])){
				currentlyLogged = true;
			}
			logincount = usersToLoginCount.get(command[2]);
			logincount = logincount != null ? logincount : 0 ;		
			
			System.out.printf("%s:%s:%d\n",command[2], Boolean.toString(currentlyLogged), logincount );
		}

	}

}
