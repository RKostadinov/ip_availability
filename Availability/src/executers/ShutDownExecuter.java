package executers;

import java.io.IOException;
import java.io.PrintStream;

import main.*;


public class ShutDownExecuter extends BaseExecuter {
	Server server;
	public ShutDownExecuter(String[] command, Server server, PrintStream out) {
		super(command, out);
		this.server = server;
	}

	@Override
	public void execute() {
		if (currentlyLoggedUsers.contains(command[0])) {
			out.println("ok");
			try {
				server.stopServer();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			out.println("error:notlogged");
		}

	}

}
