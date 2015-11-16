package main;

import java.io.IOException;



public class ServerStarter {
	private static final int SERVER_PORT = 23;

	public static void main(String[] args) throws IOException {
		final Server server = new Server(SERVER_PORT);
		server.startServer();
	}
}
