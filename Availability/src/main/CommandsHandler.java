package main;


import java.io.PrintStream;
import java.net.Socket;

import executers.*;

public class CommandsHandler {
	
	public static void execute(String command, Server server, PrintStream out, Socket socket) {
		BaseExecuter baseExecuter = null;
		String[] split = command.split(":");

		if (split.length < 2) {
			out.println("error:unknowncommand");
		}

		switch (split[1]) {
		case "login":
			baseExecuter = new LoginExecuter(split,out, socket);
			break;
		case "logout":
			baseExecuter = new LogoutExecuter(split, out);
			break;
		case "info":
			baseExecuter = new InfoExecuter(split, out);
			break;
		case "listavailable":
			baseExecuter = new ListExecuter(split, out);
			break;
		case "listabsent":
			baseExecuter = new ListAbsentExecuter(split, out);
			break;
		case "shutdown":
			baseExecuter = new ShutDownExecuter(split, server, out);
			break;
			
		default:
			out.println("error:unknowncommand");
			break;
		}

		if (baseExecuter != null)
			baseExecuter.attemptExecute();
	}
}
