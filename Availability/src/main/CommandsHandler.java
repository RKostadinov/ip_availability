package main;


import executers.*;

public class CommandsHandler {
	 static DataHolder dataHolder = new DataHolder();

	public static void execute(String command) {
		BaseExecuter baseExecuter = null;
		String[] split = command.split(":");

		if (split.length < 2) {
			System.out.println("error:unknowncommand");
		}

		switch (split[1]) {
		case "login":
			baseExecuter = new LoginExecuter(split, dataHolder);
			break;
		case "logout":
			baseExecuter = new LogoutExecuter(split, dataHolder);
			break;
		case "info":
			baseExecuter = new InfoExecuter(split, dataHolder);
			break;
		case "listavailable":
			baseExecuter = new ListExecuter(split, dataHolder);
			break;
		case "listabsent":
			baseExecuter = new ListAbsentExecuter(split, dataHolder);
			break;
		case "shutdown":
			baseExecuter = new ShutDownExecuter(split, dataHolder);
			break;
			
		default:
			System.out.println("error:unknowncommand");
			break;
		}

		if (baseExecuter != null)
			baseExecuter.attemptExecute();
	}
}
