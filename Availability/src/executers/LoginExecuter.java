package executers;

import java.io.IOException;
import java.io.PrintStream;
import main.ClientHandler;
import user.User;

public class LoginExecuter extends BaseExecuter {
	ClientHandler clientHandler;
	public LoginExecuter(String[] command, PrintStream out, ClientHandler clientHandler) {
		super(command, out);
		this.clientHandler = clientHandler;
	}

	@Override
	public void execute() {

//		first login
		if (usersToLoginCount.get(command[0]) == null) {
			usersToLoginCount.put(command[0], new User(command[0], clientHandler.getSocket()));
		} else {
			if (!currentlyLoggedUsers.contains(command[0])) {
				usersToLoginCount.get(command[0]).afterLogin();
			}else{
//				Already logged
				//disconnect
				User user = usersToLoginCount.get(command[0]);
				try {
					user.disconnect();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}	
		}
		if (!currentlyLoggedUsers.contains(command[0])) {
			currentlyLoggedUsers.add(command[0]);
		}
		clientHandler.setLogged(true);
		clientHandler.username = command[0];
		out.println("ok");
	}

}
