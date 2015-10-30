import java.util.List;
import java.util.Map;


public class InfoExecuter extends BaseExecuter {

	public InfoExecuter(String[] command, List<String> currentlyLoggedUsers, Map<String, Integer> usersToLoginCount) {
		super(command, currentlyLoggedUsers, usersToLoginCount);
		
	}

	@Override
	public void execute() {
		boolean currentlyLogged = false;
		int logincount = 0; 
		
		if (!currentlyLoggedUsers.contains(command[0])) {
			System.out.println("error:notlogged");
		}else{
			System.out.println("ok:");
			if(currentlyLoggedUsers.contains(command[2])){
				currentlyLogged = true;
			}
			if (usersToLoginCount.get(command[2]) != null) {
				
			}
			
		}

	}

}
