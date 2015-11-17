package executers;

import java.io.PrintStream;

import user.User;
import main.ClientHandler;
import main.DataHolder;


public class InfoExecuter extends BaseExecuter {
	ClientHandler clientHandler;
	public InfoExecuter(String[] command, PrintStream out, ClientHandler clientHandler) {
		super(command, out);
		this.clientHandler = clientHandler;
	}

	@Override
	public void execute() {
		DataHolder dataHolder = DataHolder.getInstance();
		boolean currentlyLogged = false;
		User user; 
		
		if (!dataHolder.currentlyLoggedUsers.contains(command[0]) || !clientHandler.isLogged()) {
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
