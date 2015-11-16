package main;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler implements Runnable {
	private final Socket socket;

	private final Server server;

	public ClientHandler(Server server, Socket socket) {
		this.socket = socket;
		this.server = server;
	}
	
	@Override
	public void run() {
		try {
			final PrintStream out = 
				new PrintStream(socket.getOutputStream());
			final Scanner scanner =
				new Scanner(socket.getInputStream());
			out.println("Vuvedi Komanda: ");
			while (scanner.hasNextLine()) {
				final String line = scanner.nextLine();

				
				CommandsHandler.execute(line,server,out, socket);
				out.println("Vuvedi Komanda: ");
				
			}
			scanner.close();
			out.close();
		} catch (IOException e) {
			// TODO check if closed before printing error
			e.printStackTrace();
		} finally {
			server.onClientStopped(this);
		}
	}
	
	public void stopClient() throws IOException {
		socket.close();
		// TODO add variable closed
	}
}
