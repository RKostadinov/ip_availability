package executers;

import java.io.PrintStream;

import main.DataHolder;
import main.User;


public class InfoExecuter extends BaseExecuter {

	public InfoExecuter(String[] command, PrintStream out) {
		super(command, out);
	}

	@Override
	public void execute() {
		DataHolder dataHolder = DataHolder.getInstance();
		boolean currentlyLogged = false;
		User user; 
		
		if (!dataHolder.currentlyLoggedUsers.contains(command[0])) {
			out.println("error:notlogged");
		}else{
			out.print("ok:");
			if(dataHolder.currentlyLoggedUsers.contains(command[2])){
				currentlyLogged = true;
			}
			user = dataHolder.usersToLoginCount.get(command[2]);
			
			out.printf("%s:%s:",command[2], Boolean.toString(currentlyLogged));
			
			if(user != null){
				user.display(out);
			}else{
				out.println("0");
			}
		}

	}

}
