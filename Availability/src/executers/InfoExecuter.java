package executers;

import java.io.PrintStream;

import main.DataHolder;
import main.UserInfo;


public class InfoExecuter extends BaseExecuter {

	public InfoExecuter(String[] command, PrintStream out) {
		super(command, out);
	}

	@Override
	public void execute() {
		boolean currentlyLogged = false;
		UserInfo userInfo; 
		
		if (!currentlyLoggedUsers.contains(command[0])) {
			out.println("error:notlogged");
		}else{
			out.print("ok:");
			if(currentlyLoggedUsers.contains(command[2])){
				currentlyLogged = true;
			}
			userInfo = usersToLoginCount.get(command[2]);
			
			out.printf("%s:%s:",command[2], Boolean.toString(currentlyLogged));
			
			if(userInfo != null){
				userInfo.display(out);
			}else{
				out.println("0");
			}
		}

	}

}
