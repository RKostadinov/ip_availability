package executers;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

import main.User;

public class LoginExecuter extends BaseExecuter {
	Socket socket;
	public LoginExecuter(String[] command, PrintStream out, Socket socket) {
		super(command, out);
		this.socket = socket;
	}

	@Override
	public void execute() {

//		first login
		if (usersToLoginCount.get(command[0]) == null) {
			usersToLoginCount.put(command[0], new User(command[0], socket));
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
		out.println("ok");
	}

}
