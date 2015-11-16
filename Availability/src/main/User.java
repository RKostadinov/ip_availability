package main;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class User {
	String user;
	boolean loggedIn;
	Integer count = 0;
	ArrayList<Date> dates;
	Socket socket;
	
	public User(String user, Socket socket) {
		this.user = user;
		this.socket = socket;
		
		count = 1;
		dates = new ArrayList<>();
		Date date = new Date();
		dates.add(date);

	}
	
	public void afterLogin(){
		count++;
		Date date = new Date();
		dates.add(date);
		loggedIn = true;

	}
	
	public void afterLogout(){
		Date date = new Date();
		dates.add(date);
		loggedIn = false;
		}
	
	public void display(PrintStream out){
		out.printf("%d:", count);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH'_'mm'_'ss.SSSZ");
		for(Date date:dates){
			out.printf("%s:",dateFormat.format(date));
		}		
		out.println();
	}

	public void disconnect() throws IOException {
		socket.close();
	}
	
	
	

}
